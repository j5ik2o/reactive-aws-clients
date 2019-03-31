package com.github.j5ik2o.reactive.aws.model

import java.io.InputStream
import java.nio.ByteBuffer
import java.nio.charset.{ Charset, StandardCharsets }
import java.util

object SdkBytes {

  def fromByteBuffer(byteBuffer: ByteBuffer): SdkBytes = {
    new SdkBytes(BinaryUtils.copyBytesFrom(byteBuffer))
  }

  def fromByteArray(bytes: Array[Byte]): SdkBytes = {
    new SdkBytes(util.Arrays.copyOf(bytes, bytes.length))
  }

  def fromString(string: String, charset: Charset): SdkBytes = {
    new SdkBytes(string.getBytes(charset))
  }

  def fromUtf8String(string: String): SdkBytes = {
    fromString(string, StandardCharsets.UTF_8)
  }

  def fromInputStream(inputStream: InputStream): SdkBytes = {
    new SdkBytes(IoUtils.toByteArray(inputStream))
  }

}

final case class SdkBytes(bytes: Array[Byte]) extends BytesWrapper(bytes)
