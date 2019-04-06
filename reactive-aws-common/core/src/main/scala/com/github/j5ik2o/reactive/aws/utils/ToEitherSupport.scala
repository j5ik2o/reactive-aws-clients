package com.github.j5ik2o.reactive.aws.utils

final class ToEitherOps[A](val f: () => A) extends AnyVal {

  def toEither: Either[Throwable, A] =
    try {
      Right(f())
    } catch {
      case t: Throwable =>
        Left(t)
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEitherSupport {

  implicit def toEitherOps[A](f: => A): ToEitherOps[A] = new ToEitherOps[A](() => f)

}
