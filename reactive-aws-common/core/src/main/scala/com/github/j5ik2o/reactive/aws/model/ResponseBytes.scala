package com.github.j5ik2o.reactive.aws.model

object ResponseBytes {
  def fromByteArray[T](response: T, bytes: Array[Byte]): ResponseBytes[T] = ResponseBytes(response, bytes)
}

final case class ResponseBytes[T](response: T, bytes: Array[Byte]) extends BytesWrapper(bytes) {}
