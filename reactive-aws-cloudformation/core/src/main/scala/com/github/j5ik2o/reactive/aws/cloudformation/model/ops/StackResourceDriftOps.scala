// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackResourceDriftBuilderOps(val self: StackResourceDrift.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def logicalResourceIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  } // String

  final def physicalResourceIdAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  } // String

  final def physicalResourceIdContextAsScala(
      value: Option[Seq[PhysicalResourceIdContextKeyValuePair]]
  ): StackResourceDrift.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.physicalResourceIdContext(v.asJava)
    } // Seq[PhysicalResourceIdContextKeyValuePair]
  }

  final def resourceTypeAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  } // String

  final def expectedPropertiesAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.expectedProperties(v)
    }
  } // String

  final def actualPropertiesAsScala(value: Option[String]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.actualProperties(v)
    }
  } // String

  final def propertyDifferencesAsScala(value: Option[Seq[PropertyDifference]]): StackResourceDrift.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.propertyDifferences(v.asJava)
    } // Seq[PropertyDifference]
  }

  final def stackResourceDriftStatusAsScala(value: Option[StackResourceDriftStatus]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.stackResourceDriftStatus(v)
    }
  } // StackResourceDriftStatus

  final def timestampAsScala(value: Option[java.time.Instant]): StackResourceDrift.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  } // java.time.Instant

}

final class StackResourceDriftOps(val self: StackResourceDrift) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId) // String

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId) // String

  final def physicalResourceIdContextAsScala: Option[Seq[PhysicalResourceIdContextKeyValuePair]] =
    Option(self.physicalResourceIdContext).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[PhysicalResourceIdContextKeyValuePair]

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType) // String

  final def expectedPropertiesAsScala: Option[String] = Option(self.expectedProperties) // String

  final def actualPropertiesAsScala: Option[String] = Option(self.actualProperties) // String

  final def propertyDifferencesAsScala: Option[Seq[PropertyDifference]] = Option(self.propertyDifferences).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[PropertyDifference]

  final def stackResourceDriftStatusAsScala: Option[StackResourceDriftStatus] =
    Option(self.stackResourceDriftStatus) // StackResourceDriftStatus

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp) // java.time.Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackResourceDriftOps {

  implicit def toStackResourceDriftBuilderOps(v: StackResourceDrift.Builder): StackResourceDriftBuilderOps =
    new StackResourceDriftBuilderOps(v)

  implicit def toStackResourceDriftOps(v: StackResourceDrift): StackResourceDriftOps = new StackResourceDriftOps(v)

}
