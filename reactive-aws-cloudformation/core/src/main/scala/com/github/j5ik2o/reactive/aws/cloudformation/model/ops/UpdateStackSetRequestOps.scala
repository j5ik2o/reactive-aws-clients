// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackSetRequestBuilderOps(val self: UpdateStackSetRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def templateBodyAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  } // String

  final def templateURLAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.templateURL(v)
    }
  } // String

  final def usePreviousTemplateAsScala(value: Option[Boolean]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.usePreviousTemplate(v)
    }
  } // Boolean

  final def parametersAsScala(value: Option[Seq[Parameter]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[Parameter]
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    } // Seq[Capability]
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    } // Seq[Tag]
  }

  final def operationPreferencesAsScala(value: Option[StackSetOperationPreferences]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.operationPreferences(v)
    }
  } // StackSetOperationPreferences

  final def administrationRoleARNAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.administrationRoleARN(v)
    }
  } // String

  final def executionRoleNameAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.executionRoleName(v)
    }
  } // String

  final def operationIdAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  } // String

  final def accountsAsScala(value: Option[Seq[String]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.accounts(v.asJava)
    } // Seq[String]
  }

  final def regionsAsScala(value: Option[Seq[String]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.regions(v.asJava)
    } // Seq[String]
  }

}

final class UpdateStackSetRequestOps(val self: UpdateStackSetRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def templateBodyAsScala: Option[String] = Option(self.templateBody) // String

  final def templateURLAsScala: Option[String] = Option(self.templateURL) // String

  final def usePreviousTemplateAsScala: Option[Boolean] = Option(self.usePreviousTemplate) // Boolean

  final def parametersAsScala: Option[Seq[Parameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Capability]

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Tag]

  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] =
    Option(self.operationPreferences) // StackSetOperationPreferences

  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN) // String

  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName) // String

  final def operationIdAsScala: Option[String] = Option(self.operationId) // String

  final def accountsAsScala: Option[Seq[String]] = Option(self.accounts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def regionsAsScala: Option[Seq[String]] = Option(self.regions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackSetRequestOps {

  implicit def toUpdateStackSetRequestBuilderOps(v: UpdateStackSetRequest.Builder): UpdateStackSetRequestBuilderOps =
    new UpdateStackSetRequestBuilderOps(v)

  implicit def toUpdateStackSetRequestOps(v: UpdateStackSetRequest): UpdateStackSetRequestOps =
    new UpdateStackSetRequestOps(v)

}
