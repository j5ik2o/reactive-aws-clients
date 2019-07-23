// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackRequestBuilderOps(val self: UpdateStackRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usePreviousTemplateAsScala(value: Option[Boolean]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.usePreviousTemplate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyDuringUpdateBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyDuringUpdateBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyDuringUpdateURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyDuringUpdateURL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Seq[Parameter]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala(value: Option[Seq[Capability]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capabilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypesAsScala(value: Option[Seq[String]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceTypes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyBodyAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyURLAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyURL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationARNsAsScala(value: Option[Seq[String]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.notificationARNs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): UpdateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): UpdateStackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class UpdateStackRequestOps(val self: UpdateStackRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usePreviousTemplateAsScala: Option[Boolean] = Option(self.usePreviousTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyDuringUpdateBodyAsScala: Option[String] = Option(self.stackPolicyDuringUpdateBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyDuringUpdateURLAsScala: Option[String] = Option(self.stackPolicyDuringUpdateURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypesAsScala: Option[Seq[String]] = Option(self.resourceTypes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala: Option[String] = Option(self.roleARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] = Option(self.rollbackConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackRequestOps {

  implicit def toUpdateStackRequestBuilderOps(v: UpdateStackRequest.Builder): UpdateStackRequestBuilderOps =
    new UpdateStackRequestBuilderOps(v)

  implicit def toUpdateStackRequestOps(v: UpdateStackRequest): UpdateStackRequestOps = new UpdateStackRequestOps(v)

}
