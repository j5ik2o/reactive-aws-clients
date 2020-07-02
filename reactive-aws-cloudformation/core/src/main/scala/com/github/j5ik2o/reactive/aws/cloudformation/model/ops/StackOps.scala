// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackBuilderOps(val self: Stack.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v => self.stackId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v => self.stackName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeSetIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v => self.changeSetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Seq[Parameter]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v => self.creationTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v => self.deletionTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimeAsScala(value: Option[java.time.Instant]): Stack.Builder = {
    value.fold(self) { v => self.lastUpdatedTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): Stack.Builder = {
    value.fold(self) { v => self.rollbackConfiguration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackStatusAsScala(value: Option[StackStatus]): Stack.Builder = {
    value.fold(self) { v => self.stackStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackStatusReasonAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v => self.stackStatusReason(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableRollbackAsScala(value: Option[Boolean]): Stack.Builder = {
    value.fold(self) { v => self.disableRollback(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationARNsAsScala(value: Option[Seq[String]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.notificationARNs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutInMinutesAsScala(value: Option[Int]): Stack.Builder = {
    value.fold(self) { v => self.timeoutInMinutes(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala(value: Option[Seq[Capability]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capabilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputsAsScala(value: Option[Seq[Output]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.outputs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v => self.roleARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): Stack.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableTerminationProtectionAsScala(value: Option[Boolean]): Stack.Builder = {
    value.fold(self) { v => self.enableTerminationProtection(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parentIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v => self.parentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootIdAsScala(value: Option[String]): Stack.Builder = {
    value.fold(self) { v => self.rootId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala(value: Option[StackDriftInformation]): Stack.Builder = {
    value.fold(self) { v => self.driftInformation(v) }
  }

}

final class StackOps(val self: Stack) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackIdAsScala: Option[String] = Option(self.stackId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def changeSetIdAsScala: Option[String] = Option(self.changeSetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Seq[Parameter]] =
    Option(self.parameters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletionTimeAsScala: Option[java.time.Instant] = Option(self.deletionTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lastUpdatedTimeAsScala: Option[java.time.Instant] = Option(self.lastUpdatedTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] = Option(self.rollbackConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackStatusAsScala: Option[StackStatus] = Option(self.stackStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackStatusReasonAsScala: Option[String] = Option(self.stackStatusReason)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableRollbackAsScala: Option[Boolean] = Option(self.disableRollback)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationARNsAsScala: Option[Seq[String]] =
    Option(self.notificationARNs).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala: Option[Seq[Capability]] =
    Option(self.capabilities).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def outputsAsScala: Option[Seq[Output]] =
    Option(self.outputs).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala: Option[String] = Option(self.roleARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableTerminationProtectionAsScala: Option[Boolean] = Option(self.enableTerminationProtection)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parentIdAsScala: Option[String] = Option(self.parentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rootIdAsScala: Option[String] = Option(self.rootId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def driftInformationAsScala: Option[StackDriftInformation] = Option(self.driftInformation)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackOps {

  implicit def toStackBuilderOps(v: Stack.Builder): StackBuilderOps = new StackBuilderOps(v)

  implicit def toStackOps(v: Stack): StackOps = new StackOps(v)

}
