// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeChangeSetResponseBuilderOps(val self: DescribeChangeSetResponse.Builder) extends AnyVal {

  final def changeSetNameAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  } // String

  final def changeSetIdAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.changeSetId(v)
    }
  } // String

  final def stackIdAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.stackId(v)
    }
  } // String

  final def stackNameAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def parametersAsScala(value: Option[Seq[Parameter]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[Parameter]
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  } // java.time.Instant

  final def executionStatusAsScala(value: Option[ExecutionStatus]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.executionStatus(v)
    }
  } // ExecutionStatus

  final def statusAsScala(value: Option[ChangeSetStatus]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // ChangeSetStatus

  final def statusReasonAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.statusReason(v)
    }
  } // String

  final def notificationARNsAsScala(value: Option[Seq[String]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    } // Seq[String]
  }

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  } // RollbackConfiguration

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    } // Seq[Capability]
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def changesAsScala(value: Option[Seq[Change]]): DescribeChangeSetResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.changes(v.asJava)
    } // Seq[Change]
  }

  final def nextTokenAsScala(value: Option[String]): DescribeChangeSetResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeChangeSetResponseOps(val self: DescribeChangeSetResponse) extends AnyVal {

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName) // String

  final def changeSetIdAsScala: Option[String] = Option(self.changeSetId) // String

  final def stackIdAsScala: Option[String] = Option(self.stackId) // String

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime) // java.time.Instant

  final def executionStatusAsScala: Option[ExecutionStatus] = Option(self.executionStatus) // ExecutionStatus

  final def statusAsScala: Option[ChangeSetStatus] = Option(self.status) // ChangeSetStatus

  final def statusReasonAsScala: Option[String] = Option(self.statusReason) // String

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] =
    Option(self.rollbackConfiguration) // RollbackConfiguration

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Capability]

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def changesAsScala: Option[Seq[Change]] = Option(self.changes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Change]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeChangeSetResponseOps {

  implicit def toDescribeChangeSetResponseBuilderOps(
      v: DescribeChangeSetResponse.Builder
  ): DescribeChangeSetResponseBuilderOps = new DescribeChangeSetResponseBuilderOps(v)

  implicit def toDescribeChangeSetResponseOps(v: DescribeChangeSetResponse): DescribeChangeSetResponseOps =
    new DescribeChangeSetResponseOps(v)

}
