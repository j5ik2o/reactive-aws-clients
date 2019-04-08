// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackSetRequestBuilderOps(val self: CreateStackSetRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): CreateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def templateBodyAsScala(value: Option[String]): CreateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  final def templateURLAsScala(value: Option[String]): CreateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): CreateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): CreateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def administrationRoleARNAsScala(value: Option[String]): CreateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.administrationRoleARN(v)
    }
  }

  final def executionRoleNameAsScala(value: Option[String]): CreateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.executionRoleName(v)
    }
  }

  final def clientRequestTokenAsScala(value: Option[String]): CreateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class CreateStackSetRequestOps(val self: CreateStackSetRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN)

  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName)

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStackSetRequestOps {

  implicit def toCreateStackSetRequestBuilderOps(v: CreateStackSetRequest.Builder): CreateStackSetRequestBuilderOps =
    new CreateStackSetRequestBuilderOps(v)

  implicit def toCreateStackSetRequestOps(v: CreateStackSetRequest): CreateStackSetRequestOps =
    new CreateStackSetRequestOps(v)

}
