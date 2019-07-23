// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class JobQueueDetailBuilderOps(val self: JobQueueDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueNameAsScala(value: Option[String]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.jobQueueName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueArnAsScala(value: Option[String]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.jobQueueArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[JQState]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[JQStatus]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priorityAsScala(value: Option[Int]): JobQueueDetail.Builder = {
    value.fold(self) { v =>
      self.priority(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentOrderAsScala(value: Option[Seq[ComputeEnvironmentOrder]]): JobQueueDetail.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.computeEnvironmentOrder(v.asJava)
    }
  }

}

final class JobQueueDetailOps(val self: JobQueueDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueNameAsScala: Option[String] = Option(self.jobQueueName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobQueueArnAsScala: Option[String] = Option(self.jobQueueArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[JQState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[JQStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def priorityAsScala: Option[Int] = Option(self.priority)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentOrderAsScala: Option[Seq[ComputeEnvironmentOrder]] =
    Option(self.computeEnvironmentOrder).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJobQueueDetailOps {

  implicit def toJobQueueDetailBuilderOps(v: JobQueueDetail.Builder): JobQueueDetailBuilderOps =
    new JobQueueDetailBuilderOps(v)

  implicit def toJobQueueDetailOps(v: JobQueueDetail): JobQueueDetailOps = new JobQueueDetailOps(v)

}
