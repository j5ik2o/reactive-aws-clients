// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackRequestBuilderOps(val self: CreateStackRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  final def templateBodyAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  final def templateURLAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def disableRollbackAsScala(value: Option[Boolean]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.disableRollback(v)
    }
  }

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  }

  final def timeoutInMinutesAsScala(value: Option[Int]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.timeoutInMinutes(v)
    }
  }

  final def notificationARNsAsScala(value: Option[Seq[String]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def resourceTypesAsScala(value: Option[Seq[String]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceTypes(v.asJava)
    }
  }

  final def roleARNAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  }

  final def onFailureAsScala(value: Option[OnFailure]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.onFailure(v)
    }
  }

  final def stackPolicyBodyAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  }

  final def stackPolicyURLAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyURL(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

  final def enableTerminationProtectionAsScala(value: Option[Boolean]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.enableTerminationProtection(v)
    }
  }

}

final class CreateStackRequestOps(val self: CreateStackRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName)

  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def disableRollbackAsScala: Option[Boolean] = Option(self.disableRollback)

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] = Option(self.rollbackConfiguration)

  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes)

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def resourceTypesAsScala: Option[Seq[String]] = Option(self.resourceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def roleARNAsScala: Option[String] = Option(self.roleARN)

  final def onFailureAsScala: Option[OnFailure] = Option(self.onFailure)

  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody)

  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

  final def enableTerminationProtectionAsScala: Option[Boolean] = Option(self.enableTerminationProtection)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStackRequestOps {

  implicit def toCreateStackRequestBuilderOps(v: CreateStackRequest.Builder): CreateStackRequestBuilderOps =
    new CreateStackRequestBuilderOps(v)

  implicit def toCreateStackRequestOps(v: CreateStackRequest): CreateStackRequestOps = new CreateStackRequestOps(v)

}
