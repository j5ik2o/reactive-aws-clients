// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class AttemptContainerDetailBuilderOps(val self: AttemptContainerDetail.Builder) extends AnyVal {

  final def containerInstanceArnAsScala(value: Option[String]): AttemptContainerDetail.Builder = {
    value.fold(self) { v =>
      self.containerInstanceArn(v)
    }
  }

  final def taskArnAsScala(value: Option[String]): AttemptContainerDetail.Builder = {
    value.fold(self) { v =>
      self.taskArn(v)
    }
  }

  final def exitCodeAsScala(value: Option[Int]): AttemptContainerDetail.Builder = {
    value.fold(self) { v =>
      self.exitCode(v)
    }
  }

  final def reasonAsScala(value: Option[String]): AttemptContainerDetail.Builder = {
    value.fold(self) { v =>
      self.reason(v)
    }
  }

  final def logStreamNameAsScala(value: Option[String]): AttemptContainerDetail.Builder = {
    value.fold(self) { v =>
      self.logStreamName(v)
    }
  }

  final def networkInterfacesAsScala(value: Option[Seq[NetworkInterface]]): AttemptContainerDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.networkInterfaces(v.asJava)
    }
  }

}

final class AttemptContainerDetailOps(val self: AttemptContainerDetail) extends AnyVal {

  final def containerInstanceArnAsScala: Option[String] = Option(self.containerInstanceArn)

  final def taskArnAsScala: Option[String] = Option(self.taskArn)

  final def exitCodeAsScala: Option[Int] = Option(self.exitCode)

  final def reasonAsScala: Option[String] = Option(self.reason)

  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  final def networkInterfacesAsScala: Option[Seq[NetworkInterface]] = Option(self.networkInterfaces).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttemptContainerDetailOps {

  implicit def toAttemptContainerDetailBuilderOps(v: AttemptContainerDetail.Builder): AttemptContainerDetailBuilderOps =
    new AttemptContainerDetailBuilderOps(v)

  implicit def toAttemptContainerDetailOps(v: AttemptContainerDetail): AttemptContainerDetailOps =
    new AttemptContainerDetailOps(v)

}
