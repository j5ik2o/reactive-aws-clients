// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackBuilderOps(val self: Stack.Builder) extends AnyVal {

  final def stackIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def changeSetIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.changeSetId(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def parametersAsScala(value: Option[Seq[Parameter]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[Parameter]
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // Instant

  final def deletionTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v =>
      self.deletionTime(v)
    }
  } // Instant

  final def lastUpdatedTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v =>
      self.lastUpdatedTime(v)
    }
  } // Instant

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): Stack.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  } // RollbackConfiguration

  final def stackStatusAsScala(value: Option[StackStatus]): Stack.Builder = {
    value.fold(self) { v =>
      self.stackStatus(v)
    }
  } // String

  final def stackStatusReasonAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.stackStatusReason(v)
    }
  } // String

  final def disableRollbackAsScala(value: Option[Boolean]): Stack.Builder = {
    value.fold(self) { v =>
      self.disableRollback(v)
    }
  } // Boolean

  final def notificationARNsAsScala(value: Option[Seq[String]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    } // Seq[String]
  }

  final def timeoutInMinutesAsScala(value: Option[Int]): Stack.Builder = {
    value.fold(self) { v =>
      self.timeoutInMinutes(v)
    }
  } // Int

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    } // Seq[String]
  }

  final def outputsAsScala(value: Option[Seq[Output]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.outputs(v.asJava)
    } // Seq[Output]
  }

  final def roleARNAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  } // String

  final def tagsAsScala(value: Option[Seq[Tag]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def enableTerminationProtectionAsScala(value: Option[Boolean]): Stack.Builder = {
    value.fold(self) { v =>
      self.enableTerminationProtection(v)
    }
  } // Boolean

  final def parentIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.parentId(v)
    }
  } // String

  final def rootIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v =>
      self.rootId(v)
    }
  } // String

  final def driftInformationAsScala(value: Option[StackDriftInformation]): Stack.Builder = {
    value.fold(self) { v =>
      self.driftInformation(v)
    }
  } // StackDriftInformation

}

final class StackOps(val self: Stack) extends AnyVal {

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def changeSetIdAsScala: Option[String] = Option(self.changeSetId) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime) // Instant

  final def deletionTimeAsScala: Option[java.time.Instant] = Option(self.deletionTime) // Instant

  final def lastUpdatedTimeAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTime) // Instant

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] =
    Option(self.rollbackConfiguration) // RollbackConfiguration

  final def stackStatusAsScala: Option[StackStatus] = Option(self.stackStatus) // String

  final def stackStatusReasonAsScala: Option[String] = Option(self.stackStatusReason) // String

  final def disableRollbackAsScala: Option[Boolean] = Option(self.disableRollback) // Boolean

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes) // Int

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def outputsAsScala: Option[Seq[Output]] = Option(self.outputs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Output]

  final def roleARNAsScala: Option[String] = Option(self.roleARN) // String

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def enableTerminationProtectionAsScala: Option[Boolean] = Option(self.enableTerminationProtection) // Boolean

  final def parentIdAsScala: Option[String] = Option(self.parentId) // String

  final def rootIdAsScala: Option[String] = Option(self.rootId) // String

  final def driftInformationAsScala: Option[StackDriftInformation] =
    Option(self.driftInformation) // StackDriftInformation

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackOps {

  implicit def toStackBuilderOps(v: Stack.Builder): StackBuilderOps = new StackBuilderOps(v)

  implicit def toStackOps(v: Stack): StackOps = new StackOps(v)

}
