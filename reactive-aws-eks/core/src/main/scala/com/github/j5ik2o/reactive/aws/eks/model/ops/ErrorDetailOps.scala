// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ErrorDetailBuilderOps(val self: ErrorDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorCodeAsScala(value: Option[ErrorCode]): ErrorDetail.Builder = {
    value.fold(self) { v => self.errorCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorMessageAsScala(value: Option[String]): ErrorDetail.Builder = {
    value.fold(self) { v => self.errorMessage(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdsAsScala(value: Option[Seq[String]]): ErrorDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceIds(v.asJava)
    }
  }

}

final class ErrorDetailOps(val self: ErrorDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorCodeAsScala: Option[ErrorCode] = Option(self.errorCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def errorMessageAsScala: Option[String] = Option(self.errorMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdsAsScala: Option[Seq[String]] =
    Option(self.resourceIds).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToErrorDetailOps {

  implicit def toErrorDetailBuilderOps(v: ErrorDetail.Builder): ErrorDetailBuilderOps = new ErrorDetailBuilderOps(v)

  implicit def toErrorDetailOps(v: ErrorDetail): ErrorDetailOps = new ErrorDetailOps(v)

}
