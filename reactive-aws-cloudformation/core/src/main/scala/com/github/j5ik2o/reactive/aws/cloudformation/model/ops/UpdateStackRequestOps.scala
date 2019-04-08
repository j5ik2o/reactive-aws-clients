// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackRequestBuilderOps(val self: UpdateStackRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def templateBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  final def templateURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  final def usePreviousTemplateAsScala(value: Option[Boolean]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.usePreviousTemplate(v)
    }
  }

  final def stackPolicyDuringUpdateBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyDuringUpdateBody(v)
    }
  }

  final def stackPolicyDuringUpdateURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyDuringUpdateURL(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def resourceTypesAsScala(value: Option[Seq[String]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceTypes(v.asJava)
    }
  }

  final def roleARNAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  }

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  }

  final def stackPolicyBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  }

  final def stackPolicyURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyURL(v)
    }
  }

  final def notificationARNsAsScala(value: Option[Seq[String]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class UpdateStackRequestOps(val self: UpdateStackRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  final def usePreviousTemplateAsScala: Option[Boolean] = Option(self.usePreviousTemplate)

  final def stackPolicyDuringUpdateBodyAsScala: Option[String] = Option(self.stackPolicyDuringUpdateBody)

  final def stackPolicyDuringUpdateURLAsScala: Option[String] = Option(self.stackPolicyDuringUpdateURL)

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

  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody)

  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL)

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackRequestOps {

  implicit def toUpdateStackRequestBuilderOps(v: UpdateStackRequest.Builder): UpdateStackRequestBuilderOps =
    new UpdateStackRequestBuilderOps(v)

  implicit def toUpdateStackRequestOps(v: UpdateStackRequest): UpdateStackRequestOps = new UpdateStackRequestOps(v)

}
