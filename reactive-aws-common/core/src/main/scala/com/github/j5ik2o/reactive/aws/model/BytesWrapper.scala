package com.github.j5ik2o.reactive.aws.model

import java.io.{ ByteArrayOutputStream, InputStream, UncheckedIOException }
import java.nio.ByteBuffer
import java.nio.charset.StandardCharsets.UTF_8
import java.nio.charset.{ CharacterCodingException, Charset, StandardCharsets }
import java.util

object StringUtils {

  def fromBytes(bytes: Array[Byte], charset: Charset): String = {
    try { charset.newDecoder.decode(ByteBuffer.wrap(bytes)).toString } catch {
      case e: CharacterCodingException =>
        throw new UncheckedIOException("Cannot encode string.", e)
    }
  }

}

@SuppressWarnings(Array("org.wartremover.warts.Var", "org.wartremover.warts.While", "org.wartremover.warts.Equals"))
object IoUtils {

  private val BUFFER_SIZE = 1024 * 4

  def toByteArray(is: InputStream): Array[Byte] = {
    val output: ByteArrayOutputStream = new ByteArrayOutputStream
    try {
      val b: Array[Byte] = new Array[Byte](BUFFER_SIZE)
      var n: Int         = 0
      while ({ n = is.read(b); n != -1 }) { output.write(b, 0, n) }
      output.toByteArray
    } finally {
      output.close()
    }
  }

}

object BinaryUtils {

  def copyBytesFrom(bb: ByteBuffer): Array[Byte] = {
    if (bb.hasArray) {
      util.Arrays.copyOfRange(bb.array, bb.arrayOffset + bb.position, bb.arrayOffset + bb.limit)
    } else {
      val dst: Array[Byte] = new Array[Byte](bb.remaining)
      bb.asReadOnlyBuffer.get(dst)
      dst
    }
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ArrayEquals"))
abstract class BytesWrapper(bytes: Array[Byte]) {

  def wrappedBytes: Array[Byte] = bytes

  def asByteBuffer: ByteBuffer = ByteBuffer.wrap(bytes).asReadOnlyBuffer()

  def asByteArray: Array[Byte] = util.Arrays.copyOf(bytes, bytes.length)

  def asString(charset: Charset): String = { StringUtils.fromBytes(bytes, charset) }

  def asUtf8String: String = asString(UTF_8)

}
