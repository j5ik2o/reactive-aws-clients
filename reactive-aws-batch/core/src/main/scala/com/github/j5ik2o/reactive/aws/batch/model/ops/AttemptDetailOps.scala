// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class AttemptDetailBuilderOps(val self: AttemptDetail.Builder) extends AnyVal {

  final def containerAsScala(value: Option[AttemptContainerDetail]): AttemptDetail.Builder = {
    value.fold(self) { v =>
      self.container(v)
    }
  }

  final def startedAtAsScala(value: Option[Long]): AttemptDetail.Builder = {
    value.fold(self) { v =>
      self.startedAt(v)
    }
  }

  final def stoppedAtAsScala(value: Option[Long]): AttemptDetail.Builder = {
    value.fold(self) { v =>
      self.stoppedAt(v)
    }
  }

  final def statusReasonAsScala(value: Option[String]): AttemptDetail.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

}

final class AttemptDetailOps(val self: AttemptDetail) extends AnyVal {

  final def containerAsScala: Option[AttemptContainerDetail] = Option(self.container)

  final def startedAtAsScala: Option[Long] = Option(self.startedAt)

  final def stoppedAtAsScala: Option[Long] = Option(self.stoppedAt)

  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttemptDetailOps {

  implicit def toAttemptDetailBuilderOps(v: AttemptDetail.Builder): AttemptDetailBuilderOps =
    new AttemptDetailBuilderOps(v)

  implicit def toAttemptDetailOps(v: AttemptDetail): AttemptDetailOps = new AttemptDetailOps(v)

}
