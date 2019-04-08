// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class StackSetBuilderOps(val self: StackSet.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

  final def stackSetIdAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def statusAsScala(value: Option[StackSetStatus]): StackSet.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def templateBodyAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): StackSet.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def stackSetARNAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.stackSetARN(v)
    }
  }

  final def administrationRoleARNAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.administrationRoleARN(v)
    }
  }

  final def executionRoleNameAsScala(value: Option[String]): StackSet.Builder = {
    value.fold(self) { v =>
      self.executionRoleName(v)
    }
  }

}

final class StackSetOps(val self: StackSet) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  final def stackSetIdAsScala: Option[String] = Option(self.stackSetId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def statusAsScala: Option[StackSetStatus] = Option(self.status)

  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def stackSetARNAsScala: Option[String] = Option(self.stackSetARN)

  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN)

  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStackSetOps {

  implicit def toStackSetBuilderOps(v: StackSet.Builder): StackSetBuilderOps = new StackSetBuilderOps(v)

  implicit def toStackSetOps(v: StackSet): StackSetOps = new StackSetOps(v)

}
