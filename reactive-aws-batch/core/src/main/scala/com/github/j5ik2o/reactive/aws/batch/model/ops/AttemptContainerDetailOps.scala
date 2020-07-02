// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class AttemptContainerDetailBuilderOps(val self: AttemptContainerDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnAsScala(value: Option[String]): AttemptContainerDetail.Builder = {
    value.fold(self) { v => self.containerInstanceArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskArnAsScala(value: Option[String]): AttemptContainerDetail.Builder = {
    value.fold(self) { v => self.taskArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala(value: Option[Int]): AttemptContainerDetail.Builder = {
    value.fold(self) { v => self.exitCode(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala(value: Option[String]): AttemptContainerDetail.Builder = {
    value.fold(self) { v => self.reason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala(value: Option[String]): AttemptContainerDetail.Builder = {
    value.fold(self) { v => self.logStreamName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala(value: Option[Seq[NetworkInterface]]): AttemptContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.networkInterfaces(v.asJava)
    }
  }

}

final class AttemptContainerDetailOps(val self: AttemptContainerDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskArnAsScala: Option[String] = Option(self.taskArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def reasonAsScala: Option[String] = Option(self.reason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] =
    Option(self.networkInterfaces).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttemptContainerDetailOps {

  implicit def toAttemptContainerDetailBuilderOps(v: AttemptContainerDetail.Builder): AttemptContainerDetailBuilderOps =
    new AttemptContainerDetailBuilderOps(v)

  implicit def toAttemptContainerDetailOps(v: AttemptContainerDetail): AttemptContainerDetailOps =
    new AttemptContainerDetailOps(v)

}
