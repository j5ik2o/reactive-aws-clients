// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateChangeSetRequestBuilderOps(val self: CreateChangeSetRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def templateBodyAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  final def templateURLAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  final def usePreviousTemplateAsScala(value: Option[Boolean]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.usePreviousTemplate(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def resourceTypesAsScala(value: Option[Seq[String]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceTypes(v.asJava)
    }
  }

  final def roleARNAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  }

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  }

  final def notificationARNsAsScala(value: Option[Seq[String]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def changeSetNameAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def changeSetTypeAsScala(value: Option[ChangeSetType]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.changeSetType(v)
    }
  }

}

final class CreateChangeSetRequestOps(val self: CreateChangeSetRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  final def usePreviousTemplateAsScala: Option[Boolean] = Option(self.usePreviousTemplate)

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def resourceTypesAsScala: Option[Seq[String]] = Option(self.resourceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def roleARNAsScala: Option[String] = Option(self.roleARN)

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] = Option(self.rollbackConfiguration)

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def changeSetTypeAsScala: Option[ChangeSetType] = Option(self.changeSetType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateChangeSetRequestOps {

  implicit def toCreateChangeSetRequestBuilderOps(v: CreateChangeSetRequest.Builder): CreateChangeSetRequestBuilderOps =
    new CreateChangeSetRequestBuilderOps(v)

  implicit def toCreateChangeSetRequestOps(v: CreateChangeSetRequest): CreateChangeSetRequestOps =
    new CreateChangeSetRequestOps(v)

}
