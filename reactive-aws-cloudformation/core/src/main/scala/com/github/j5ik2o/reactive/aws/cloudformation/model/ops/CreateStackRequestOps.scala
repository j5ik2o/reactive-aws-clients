// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackRequestBuilderOps(val self: CreateStackRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Seq[Parameter]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableRollbackAsScala(value: Option[Boolean]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.disableRollback(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutInMinutesAsScala(value: Option[Int]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.timeoutInMinutes(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationARNsAsScala(value: Option[Seq[String]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.notificationARNs(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala(value: Option[Seq[Capability]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capabilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypesAsScala(value: Option[Seq[String]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceTypes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def onFailureAsScala(value: Option[OnFailure]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.onFailure(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyBodyAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyURLAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyURL(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableTerminationProtectionAsScala(value: Option[Boolean]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.enableTerminationProtection(v)
    }
  }

}

final class CreateStackRequestOps(val self: CreateStackRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def disableRollbackAsScala: Option[Boolean] = Option(self.disableRollback)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] = Option(self.rollbackConfiguration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
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
  final def onFailureAsScala: Option[OnFailure] = Option(self.onFailure)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def enableTerminationProtectionAsScala: Option[Boolean] = Option(self.enableTerminationProtection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStackRequestOps {

  implicit def toCreateStackRequestBuilderOps(v: CreateStackRequest.Builder): CreateStackRequestBuilderOps =
    new CreateStackRequestBuilderOps(v)

  implicit def toCreateStackRequestOps(v: CreateStackRequest): CreateStackRequestOps = new CreateStackRequestOps(v)

}
