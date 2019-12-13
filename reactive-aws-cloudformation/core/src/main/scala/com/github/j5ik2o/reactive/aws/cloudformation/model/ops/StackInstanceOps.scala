// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackInstanceBuilderOps(val self: StackInstance.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetIdAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.region(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.account(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterOverridesAsScala(value: Option[Seq[Parameter]]): StackInstance.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameterOverrides(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[StackInstanceStatus]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala(value: Option[String]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftStatusAsScala(value: Option[StackDriftStatus]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.driftStatus(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastDriftCheckTimestampAsScala(value: Option[java.time.Instant]): StackInstance.Builder = {
    value.fold(self) { v =>
      self.lastDriftCheckTimestamp(v)
    }
  }

}

final class StackInstanceOps(val self: StackInstance) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionAsScala: Option[String] = Option(self.region)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountAsScala: Option[String] = Option(self.account)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterOverridesAsScala: Option[Seq[Parameter]] = Option(self.parameterOverrides).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[StackInstanceStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftStatusAsScala: Option[StackDriftStatus] = Option(self.driftStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastDriftCheckTimestampAsScala: Option[java.time.Instant] = Option(self.lastDriftCheckTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackInstanceOps {

  implicit def toStackInstanceBuilderOps(v: StackInstance.Builder): StackInstanceBuilderOps =
    new StackInstanceBuilderOps(v)

  implicit def toStackInstanceOps(v: StackInstance): StackInstanceOps = new StackInstanceOps(v)

}
