// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackRequestBuilderOps(val self: CreateStackRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def templateBodyAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  } // String

  final def templateURLAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  } // String

  final def parametersAsScala(value: Option[Seq[Parameter]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[Parameter]
  }

  final def disableRollbackAsScala(value: Option[Boolean]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.disableRollback(v)
    }
  } // Boolean

  final def rollbackConfigurationAsScala(value: Option[RollbackConfiguration]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.rollbackConfiguration(v)
    }
  } // RollbackConfiguration

  final def timeoutInMinutesAsScala(value: Option[Int]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.timeoutInMinutes(v)
    }
  } // Int

  final def notificationARNsAsScala(value: Option[Seq[String]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.notificationARNs(v.asJava)
    } // Seq[String]
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    } // Seq[Capability]
  }

  final def resourceTypesAsScala(value: Option[Seq[String]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceTypes(v.asJava)
    } // Seq[String]
  }

  final def roleARNAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  } // String

  final def onFailureAsScala(value: Option[OnFailure]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.onFailure(v)
    }
  } // OnFailure

  final def stackPolicyBodyAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyBody(v)
    }
  } // String

  final def stackPolicyURLAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackPolicyURL(v)
    }
  } // String

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def clientRequestTokenAsScala(value: Option[String]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  } // String

  final def enableTerminationProtectionAsScala(value: Option[Boolean]): CreateStackRequest.Builder = {
    value.fold(self) { v =>
      self.enableTerminationProtection(v)
    }
  } // Boolean

}

final class CreateStackRequestOps(val self: CreateStackRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def templateBodyAsScala: Option[String] = Option(self.templateBody) // String

  final def templateURLAsScala: Option[String] = Option(self.templateURL) // String

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

  final def disableRollbackAsScala: Option[Boolean] = Option(self.disableRollback) // Boolean

  final def rollbackConfigurationAsScala: Option[RollbackConfiguration] =
    Option(self.rollbackConfiguration) // RollbackConfiguration

  final def timeoutInMinutesAsScala: Option[Int] = Option(self.timeoutInMinutes) // Int

  final def notificationARNsAsScala: Option[Seq[String]] = Option(self.notificationARNs).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Capability]

  final def resourceTypesAsScala: Option[Seq[String]] = Option(self.resourceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def roleARNAsScala: Option[String] = Option(self.roleARN) // String

  final def onFailureAsScala: Option[OnFailure] = Option(self.onFailure) // OnFailure

  final def stackPolicyBodyAsScala: Option[String] = Option(self.stackPolicyBody) // String

  final def stackPolicyURLAsScala: Option[String] = Option(self.stackPolicyURL) // String

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken) // String

  final def enableTerminationProtectionAsScala: Option[Boolean] = Option(self.enableTerminationProtection) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStackRequestOps {

  implicit def toCreateStackRequestBuilderOps(v: CreateStackRequest.Builder): CreateStackRequestBuilderOps =
    new CreateStackRequestBuilderOps(v)

  implicit def toCreateStackRequestOps(v: CreateStackRequest): CreateStackRequestOps = new CreateStackRequestOps(v)

}
