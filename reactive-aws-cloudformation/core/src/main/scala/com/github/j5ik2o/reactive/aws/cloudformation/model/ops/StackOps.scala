// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackBuilderOps(val self: Stack.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  final def stackNameAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def changeSetIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.changeSetId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def deletionTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v =>
      self.deletionTime(v)
    }
  }

  final def lastUpdatedTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTime(v)
    }
  }

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): Stack.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  }

  final def stackStatusAsScala(value: Option[StackStatus]): Stack.Builder = {
    value.fold(self) { v =>
      self.stackStatus(v)
    }
  }

  final def stackStatusReasonAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.stackStatusReason(v)
    }
  }

  final def disableRollbackAsScala(value: Option[Boolean]): Stack.Builder = {
    value.fold(self) { v =>
      self.disableRollback(v)
    }
  }

  final def notificationARNsAsScala(value: Option[Seq[String]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    }
  }

  final def timeoutInMinutesAsScala(value: Option[Int]): Stack.Builder = {
    value.fold(self) { v =>
      self.timeoutInMinutes(v)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def outputsAsScala(value: Option[Seq[Output]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.outputs(v.asJava)
    }
  }

  final def roleARNAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def enableTerminationProtectionAsScala(value: Option[Boolean]): Stack.Builder = {
    value.fold(self) { v =>
      self.enableTerminationProtection(v)
    }
  }

  final def parentIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.parentId(v)
    }
  }

  final def rootIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.rootId(v)
    }
  }

  final def driftInformationAsScala(value: Option[StackDriftInformation]): Stack.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  }

}

final class StackOps(val self: Stack) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId)

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def changeSetIdAsScala: Option[String] = Option(self.changeSetId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  final def deletionTimeAsScala: Option[java.time.Instant] = Option(self.deletionTime)

  final def lastUpdatedTimeAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTime)

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] = Option(self.rollbackConfiguration)

  final def stackStatusAsScala: Option[StackStatus] = Option(self.stackStatus)

  final def stackStatusReasonAsScala: Option[String] = Option(self.stackStatusReason)

  final def disableRollbackAsScala: Option[Boolean] = Option(self.disableRollback)

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes)

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def outputsAsScala: Option[Seq[Output]] = Option(self.outputs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def roleARNAsScala: Option[String] = Option(self.roleARN)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def enableTerminationProtectionAsScala: Option[Boolean] = Option(self.enableTerminationProtection)

  final def parentIdAsScala: Option[String] = Option(self.parentId)

  final def rootIdAsScala: Option[String] = Option(self.rootId)

  final def driftInformationAsScala: Option[StackDriftInformation] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackOps {

  implicit def toStackBuilderOps(v: Stack.Builder): StackBuilderOps = new StackBuilderOps(v)

  implicit def toStackOps(v: Stack): StackOps = new StackOps(v)

}
