// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackSetRequestBuilderOps(val self: UpdateStackSetRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def templateBodyAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  }

  final def templateURLAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  }

  final def usePreviousTemplateAsScala(value: Option[Boolean]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.usePreviousTemplate(v)
    }
  }

  final def parametersAsScala(value: Option[Seq[Parameter]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def operationPreferencesAsScala(value: Option[StackSetOperationPreferences]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.operationPreferences(v)
    }
  }

  final def administrationRoleARNAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.administrationRoleARN(v)
    }
  }

  final def executionRoleNameAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.executionRoleName(v)
    }
  }

  final def operationIdAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  }

  final def accountsAsScala(value: Option[Seq[String]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.accounts(v.asJava)
    }
  }

  final def regionsAsScala(value: Option[Seq[String]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.regions(v.asJava)
    }
  }

}

final class UpdateStackSetRequestOps(val self: UpdateStackSetRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  final def usePreviousTemplateAsScala: Option[Boolean] = Option(self.usePreviousTemplate)

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] = Option(self.operationPreferences)

  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN)

  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName)

  final def operationIdAsScala: Option[String] = Option(self.operationId)

  final def accountsAsScala: Option[Seq[String]] = Option(self.accounts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def regionsAsScala: Option[Seq[String]] = Option(self.regions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackSetRequestOps {

  implicit def toUpdateStackSetRequestBuilderOps(v: UpdateStackSetRequest.Builder): UpdateStackSetRequestBuilderOps =
    new UpdateStackSetRequestBuilderOps(v)

  implicit def toUpdateStackSetRequestOps(v: UpdateStackSetRequest): UpdateStackSetRequestOps =
    new UpdateStackSetRequestOps(v)

}
