// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackRequestBuilderOps(val self: UpdateStackRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def templateBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  } // String

  final def templateURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  } // String

  final def usePreviousTemplateAsScala(value: Option[Boolean]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.usePreviousTemplate(v)
    }
  } // Boolean

  final def stackPolicyDuringUpdateBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyDuringUpdateBody(v)
    }
  } // String

  final def stackPolicyDuringUpdateURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyDuringUpdateURL(v)
    }
  } // String

  final def parametersAsScala(value: Option[Seq[Parameter]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[Parameter]
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    } // Seq[Capability]
  }

  final def resourceTypesAsScala(value: Option[Seq[String]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceTypes(v.asJava)
    } // Seq[String]
  }

  final def roleARNAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  } // String

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  } // RollbackConfiguration

  final def stackPolicyBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  } // String

  final def stackPolicyURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyURL(v)
    }
  } // String

  final def notificationARNsAsScala(value: Option[Seq[String]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    } // Seq[String]
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def clientRequestTokenAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  } // String

}

final class UpdateStackRequestOps(val self: UpdateStackRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def templateBodyAsScala: Option[String] = Option(self.templateBody) // String

  final def templateURLAsScala: Option[String] = Option(self.templateURL) // String

  final def usePreviousTemplateAsScala: Option[Boolean] = Option(self.usePreviousTemplate) // Boolean

  final def stackPolicyDuringUpdateBodyAsScala: Option[String] = Option(self.stackPolicyDuringUpdateBody) // String

  final def stackPolicyDuringUpdateURLAsScala: Option[String] = Option(self.stackPolicyDuringUpdateURL) // String

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Capability]

  final def resourceTypesAsScala: Option[Seq[String]] = Option(self.resourceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def roleARNAsScala: Option[String] = Option(self.roleARN) // String

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] =
    Option(self.rollbackConfiguration) // RollbackConfiguration

  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody) // String

  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL) // String

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackRequestOps {

  implicit def toUpdateStackRequestBuilderOps(v: UpdateStackRequest.Builder): UpdateStackRequestBuilderOps =
    new UpdateStackRequestBuilderOps(v)

  implicit def toUpdateStackRequestOps(v: UpdateStackRequest): UpdateStackRequestOps = new UpdateStackRequestOps(v)

}
