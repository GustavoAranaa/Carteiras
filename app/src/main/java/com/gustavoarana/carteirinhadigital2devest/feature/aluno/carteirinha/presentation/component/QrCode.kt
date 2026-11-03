package com.gustavoarana.carteirinhadigital2devest.feature.aluno.carteirinha.presentation.component

import android.graphics.Bitmap
import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.createBitmap
import androidx.core.graphics.set
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.qrcode.QRCodeWriter

@Composable
fun QrCode(
    conteudo: String,
    modifier: Modifier = Modifier,
    // Cores obtidas do tema atual:
    corQrCode: Int = MaterialTheme.colorScheme.primary.toArgb(), // Castanho escuro
    corFundo: Int = MaterialTheme.colorScheme.surfaceContainerLow.toArgb() // Bege claro
) {
    // Usamos remember para evitar gerar a imagem em cada recomposição desnecessária
    val bitmap = remember(conteudo, corQrCode, corFundo) {
        gerarQrCode(
            conteudo = conteudo,
            corQrCode = corQrCode,
            corFundo = corFundo
        )
    }

    Image(
        bitmap = bitmap.asImageBitmap(),
        contentDescription = "QR Code da Carteirinha",
        modifier = modifier
    )
}

fun gerarQrCode(
    conteudo: String,
    tamanho: Int = 512,
    margem: Int = 1,
    corQrCode: Int = Color.BLACK,
    corFundo: Int = Color.WHITE
): Bitmap {
    if (conteudo.isBlank()) {
        return createBitmap(tamanho, tamanho).apply {
            eraseColor(corFundo)
        }
    }

    val hints = mapOf(
        EncodeHintType.MARGIN to margem
    )

    val writer = QRCodeWriter()
    val bitMatrix = writer.encode(
        conteudo,
        BarcodeFormat.QR_CODE,
        tamanho,
        tamanho,
        hints
    )

    val bitmap = createBitmap(tamanho, tamanho)

    for (x in 0 until tamanho) {
        for (y in 0 until tamanho) {
            bitmap[x, y] = if (bitMatrix[x, y]) corQrCode else corFundo
        }
    }

    return bitmap
}