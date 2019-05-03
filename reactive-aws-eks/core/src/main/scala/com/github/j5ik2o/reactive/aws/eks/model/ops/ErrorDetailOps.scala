// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ErrorDetailBuilderOps(val self: ErrorDetail.Builder) extends AnyVal {

  final def errorCodeAsScala(value: Option[ErrorCode]): ErrorDetail.Builder = {
    value.fold(self) { v =>
      self.errorCode(v)
    }
  }

  final def errorMessageAsScala(value: Option[String]): ErrorDetail.Builder = {
    value.fold(self) { v =>
      self.errorMessage(v)
    }
  }

  final def resourceIdsAsScala(value: Option[Seq[String]]): ErrorDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceIds(v.asJava)
    }
  }

}

final class ErrorDetailOps(val self: ErrorDetail) extends AnyVal {

  final def errorCodeAsScala: Option[ErrorCode] = Option(self.errorCode)

  final def errorMessageAsScala: Option[String] = Option(self.errorMessage)

  final def resourceIdsAsScala: Option[Seq[String]] = Option(self.resourceIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToErrorDetailOps {

  implicit def toErrorDetailBuilderOps(v: ErrorDetail.Builder): ErrorDetailBuilderOps = new ErrorDetailBuilderOps(v)

  implicit def toErrorDetailOps(v: ErrorDetail): ErrorDetailOps = new ErrorDetailOps(v)

}
