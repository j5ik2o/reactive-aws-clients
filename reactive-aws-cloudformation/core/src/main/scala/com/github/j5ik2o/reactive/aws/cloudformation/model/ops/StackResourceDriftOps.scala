// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceDriftBuilderOps(val self: StackResourceDrift.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v => self.stackId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v => self.logicalResourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v => self.physicalResourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdContextAsScala(
      value: Option[Seq[PhysicalResourceIdContextKeyValuePair]]
  ): StackResourceDrift.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.physicalResourceIdContext(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedPropertiesAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v => self.expectedProperties(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actualPropertiesAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v => self.actualProperties(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propertyDifferencesAsScala(value: Option[Seq[PropertyDifference]]): StackResourceDrift.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.propertyDifferences(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceDriftStatusAsScala(value: Option[StackResourceDriftStatus]): StackResourceDrift.Builder = {
    value.fold(self) { v => self.stackResourceDriftStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala(value: Option[java.time.Instant]): StackResourceDrift.Builder = {
    value.fold(self) { v => self.timestamp(v) }
  }

}

final class StackResourceDriftOps(val self: StackResourceDrift) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdContextAsScala: Option[Seq[PhysicalResourceIdContextKeyValuePair]] =
    Option(self.physicalResourceIdContext).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expectedPropertiesAsScala: Option[String] = Option(self.expectedProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actualPropertiesAsScala: Option[String] = Option(self.actualProperties)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propertyDifferencesAsScala: Option[Seq[PropertyDifference]] =
    Option(self.propertyDifferences).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackResourceDriftStatusAsScala: Option[StackResourceDriftStatus] = Option(self.stackResourceDriftStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceDriftOps {

  implicit def toStackResourceDriftBuilderOps(v: StackResourceDrift.Builder): StackResourceDriftBuilderOps =
    new StackResourceDriftBuilderOps(v)

  implicit def toStackResourceDriftOps(v: StackResourceDrift): StackResourceDriftOps = new StackResourceDriftOps(v)

}
