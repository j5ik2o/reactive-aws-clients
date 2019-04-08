// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateChangeSetRequestBuilderOps(val self: CreateChangeSetRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def templateBodyAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  } // String

  final def templateURLAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  } // String

  final def usePreviousTemplateAsScala(value: Option[Boolean]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.usePreviousTemplate(v)
    }
  } // Boolean

  final def parametersAsScala(value: Option[Seq[Parameter]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[Parameter]
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    } // Seq[String]
  }

  final def resourceTypesAsScala(value: Option[Seq[String]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceTypes(v.asJava)
    } // Seq[String]
  }

  final def roleARNAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  } // String

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  } // RollbackConfiguration

  final def notificationARNsAsScala(value: Option[Seq[String]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    } // Seq[String]
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateChangeSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def changeSetNameAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.changeSetName(v)
    }
  } // String

  final def clientTokenAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def changeSetTypeAsScala(value: Option[ChangeSetType]): CreateChangeSetRequest.Builder = {
    value.fold(self) { v =>
      self.changeSetType(v)
    }
  } // String

}

final class CreateChangeSetRequestOps(val self: CreateChangeSetRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def templateBodyAsScala: Option[String] = Option(self.templateBody) // String

  final def templateURLAsScala: Option[String] = Option(self.templateURL) // String

  final def usePreviousTemplateAsScala: Option[Boolean] = Option(self.usePreviousTemplate) // Boolean

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def resourceTypesAsScala: Option[Seq[String]] = Option(self.resourceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def roleARNAsScala: Option[String] = Option(self.roleARN) // String

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] =
    Option(self.rollbackConfiguration) // RollbackConfiguration

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def changeSetNameAsScala: Option[String] = Option(self.changeSetName) // String

  final def clientTokenAsScala: Option[String] = Option(self.clientToken) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def changeSetTypeAsScala: Option[ChangeSetType] = Option(self.changeSetType) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateChangeSetRequestOps {

  implicit def toCreateChangeSetRequestBuilderOps(v: CreateChangeSetRequest.Builder): CreateChangeSetRequestBuilderOps =
    new CreateChangeSetRequestBuilderOps(v)

  implicit def toCreateChangeSetRequestOps(v: CreateChangeSetRequest): CreateChangeSetRequestOps =
    new CreateChangeSetRequestOps(v)

}
