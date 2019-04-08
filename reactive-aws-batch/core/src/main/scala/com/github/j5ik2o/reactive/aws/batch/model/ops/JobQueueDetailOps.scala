// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobQueueDetailBuilderOps(val self: JobQueueDetail.Builder) extends AnyVal {

  final def jobQueueNameAsScala(value: Option[String]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.jobQueueName(v)
    }
  }

  final def jobQueueArnAsScala(value: Option[String]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.jobQueueArn(v)
    }
  }

  final def stateAsScala(value: Option[JQState]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def statusAsScala(value: Option[JQStatus]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusReasonAsScala(value: Option[String]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  final def priorityAsScala(value: Option[Int]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  }

  final def computeEnvironmentOrderAsScala(value: Option[Seq[ComputeEnvironmentOrder]]): JobQueueDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.computeEnvironmentOrder(v.asJava)
    }
  }

}

final class JobQueueDetailOps(val self: JobQueueDetail) extends AnyVal {

  final def jobQueueNameAsScala: Option[String] = Option(self.jobQueueName)

  final def jobQueueArnAsScala: Option[String] = Option(self.jobQueueArn)

  final def stateAsScala: Option[JQState] = Option(self.state)

  final def statusAsScala: Option[JQStatus] = Option(self.status)

  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  final def priorityAsScala: Option[Int] = Option(self.priority)

  final def computeEnvironmentOrderAsScala: Option[Seq[ComputeEnvironmentOrder]] =
    Option(self.computeEnvironmentOrder).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobQueueDetailOps {

  implicit def toJobQueueDetailBuilderOps(v: JobQueueDetail.Builder): JobQueueDetailBuilderOps =
    new JobQueueDetailBuilderOps(v)

  implicit def toJobQueueDetailOps(v: JobQueueDetail): JobQueueDetailOps = new JobQueueDetailOps(v)

}
