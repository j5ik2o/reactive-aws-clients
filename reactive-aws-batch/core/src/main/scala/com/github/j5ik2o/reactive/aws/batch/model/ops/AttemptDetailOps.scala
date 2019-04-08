// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class AttemptDetailBuilderOps(val self: AttemptDetail.Builder) extends AnyVal {

  final def containerAsScala(value: Option[AttemptContainerDetail]): AttemptDetail.Builder = {
    value.fold(self) { v =>
      self.container(v)
    }
  } // AttemptContainerDetail

  final def startedAtAsScala(value: Option[Long]): AttemptDetail.Builder = {
    value.fold(self) { v =>
      self.startedAt(v)
    }
  } // Long

  final def stoppedAtAsScala(value: Option[Long]): AttemptDetail.Builder = {
    value.fold(self) { v =>
      self.stoppedAt(v)
    }
  } // Long

  final def statusReasonAsScala(value: Option[String]): AttemptDetail.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  } // String

}

final class AttemptDetailOps(val self: AttemptDetail) extends AnyVal {

  final def containerAsScala: Option[AttemptContainerDetail] = Option(self.container) // AttemptContainerDetail

  final def startedAtAsScala: Option[Long] = Option(self.startedAt) // Long

  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt) // Long

  final def statusReasonAsScala: Option[String] = Option(self.statusReason) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttemptDetailOps {

  implicit def toAttemptDetailBuilderOps(v: AttemptDetail.Builder): AttemptDetailBuilderOps =
    new AttemptDetailBuilderOps(v)

  implicit def toAttemptDetailOps(v: AttemptDetail): AttemptDetailOps = new AttemptDetailOps(v)

}
