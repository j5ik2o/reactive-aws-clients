package com.github.j5ik2o.reactive.aws.model

final case class ResponseWithArrayBytes[A](response: A, data: Iterable[Array[Byte]])
