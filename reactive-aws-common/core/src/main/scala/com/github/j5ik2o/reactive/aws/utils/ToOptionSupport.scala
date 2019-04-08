package com.github.j5ik2o.reactive.aws.utils

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOptionSupport {

  implicit def toOption[A](value: A): Option[A] = Option(value)

}
