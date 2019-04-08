// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceDriftBuilderOps(val self: StackResourceDrift.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  final def logicalResourceIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  final def physicalResourceIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

  final def physicalResourceIdContextAsScala(
      value: Option[Seq[PhysicalResourceIdContextKeyValuePair]]
  ): StackResourceDrift.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.physicalResourceIdContext(v.asJava)
    }
  }

  final def resourceTypeAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def expectedPropertiesAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.expectedProperties(v)
    }
  }

  final def actualPropertiesAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.actualProperties(v)
    }
  }

  final def propertyDifferencesAsScala(value: Option[Seq[PropertyDifference]]): StackResourceDrift.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.propertyDifferences(v.asJava)
    }
  }

  final def stackResourceDriftStatusAsScala(value: Option[StackResourceDriftStatus]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.stackResourceDriftStatus(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class StackResourceDriftOps(val self: StackResourceDrift) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId)

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  final def physicalResourceIdContextAsScala: Option[Seq[PhysicalResourceIdContextKeyValuePair]] =
    Option(self.physicalResourceIdContext).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  final def expectedPropertiesAsScala: Option[String] = Option(self.expectedProperties)

  final def actualPropertiesAsScala: Option[String] = Option(self.actualProperties)

  final def propertyDifferencesAsScala: Option[Seq[PropertyDifference]] = Option(self.propertyDifferences).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def stackResourceDriftStatusAsScala: Option[StackResourceDriftStatus] = Option(self.stackResourceDriftStatus)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceDriftOps {

  implicit def toStackResourceDriftBuilderOps(v: StackResourceDrift.Builder): StackResourceDriftBuilderOps =
    new StackResourceDriftBuilderOps(v)

  implicit def toStackResourceDriftOps(v: StackResourceDrift): StackResourceDriftOps = new StackResourceDriftOps(v)

}
