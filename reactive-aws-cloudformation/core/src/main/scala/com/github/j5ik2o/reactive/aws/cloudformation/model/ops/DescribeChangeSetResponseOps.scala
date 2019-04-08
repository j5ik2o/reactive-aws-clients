// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeChangeSetResponseBuilderOps(val self: DescribeChangeSetResponse.Builder) extends AnyVal {

  final def changeSetNameAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  }

  final def changeSetIdAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.changeSetId(v)
    }
  }

  final def stackIdAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  }

  final def stackNameAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def executionStatusAsScala(value: Option[ExecutionStatus]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.executionStatus(v)
    }
  }

  final def statusAsScala(value: Option[ChangeSetStatus]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def statusReasonAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  }

  final def notificationARNsAsScala(value: Option[Seq[String]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    }
  }

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def changesAsScala(value: Option[Seq[Change]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.changes(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeChangeSetResponseOps(val self: DescribeChangeSetResponse) extends AnyVal {

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName)

  final def changeSetIdAsScala: Option[String] = Option(self.changeSetId)

  final def stackIdAsScala: Option[String] = Option(self.stackId)

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  final def executionStatusAsScala: Option[ExecutionStatus] = Option(self.executionStatus)

  final def statusAsScala: Option[ChangeSetStatus] = Option(self.status)

  final def statusReasonAsScala: Option[String] = Option(self.statusReason)

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] = Option(self.rollbackConfiguration)

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def changesAsScala: Option[Seq[Change]] = Option(self.changes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeChangeSetResponseOps {

  implicit def toDescribeChangeSetResponseBuilderOps(
      v: DescribeChangeSetResponse.Builder
  ): DescribeChangeSetResponseBuilderOps = new DescribeChangeSetResponseBuilderOps(v)

  implicit def toDescribeChangeSetResponseOps(v: DescribeChangeSetResponse): DescribeChangeSetResponseOps =
    new DescribeChangeSetResponseOps(v)

}
