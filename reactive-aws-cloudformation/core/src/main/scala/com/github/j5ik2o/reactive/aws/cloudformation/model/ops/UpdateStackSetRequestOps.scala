// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackSetRequestBuilderOps(val self: UpdateStackSetRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.templateBody(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.templateURL(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usePreviousTemplateAsScala(value: Option[Boolean]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.usePreviousTemplate(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Seq[Parameter]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala(value: Option[Seq[Capability]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.capabilities(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationPreferencesAsScala(value: Option[StackSetOperationPreferences]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.operationPreferences(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def administrationRoleARNAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.administrationRoleARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleNameAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.executionRoleName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentTargetsAsScala(value: Option[DeploymentTargets]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.deploymentTargets(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionModelAsScala(value: Option[PermissionModels]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.permissionModel(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoDeploymentAsScala(value: Option[AutoDeployment]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.autoDeployment(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): UpdateStackSetRequest.Builder = {
    value.fold(self) { v => self.operationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountsAsScala(value: Option[Seq[String]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.accounts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsAsScala(value: Option[Seq[String]]): UpdateStackSetRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.regions(v.asJava)
    }
  }

}

final class UpdateStackSetRequestOps(val self: UpdateStackSetRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateBodyAsScala: Option[String] = Option(self.templateBody)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def templateURLAsScala: Option[String] = Option(self.templateURL)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def usePreviousTemplateAsScala: Option[Boolean] = Option(self.usePreviousTemplate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Seq[Parameter]] =
    Option(self.parameters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def capabilitiesAsScala: Option[Seq[Capability]] =
    Option(self.capabilities).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] = Option(self.operationPreferences)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def administrationRoleARNAsScala: Option[String] = Option(self.administrationRoleARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def executionRoleNameAsScala: Option[String] = Option(self.executionRoleName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentTargetsAsScala: Option[DeploymentTargets] = Option(self.deploymentTargets)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def permissionModelAsScala: Option[PermissionModels] = Option(self.permissionModel)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def autoDeploymentAsScala: Option[AutoDeployment] = Option(self.autoDeployment)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala: Option[String] = Option(self.operationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountsAsScala: Option[Seq[String]] =
    Option(self.accounts).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsAsScala: Option[Seq[String]] =
    Option(self.regions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackSetRequestOps {

  implicit def toUpdateStackSetRequestBuilderOps(v: UpdateStackSetRequest.Builder): UpdateStackSetRequestBuilderOps =
    new UpdateStackSetRequestBuilderOps(v)

  implicit def toUpdateStackSetRequestOps(v: UpdateStackSetRequest): UpdateStackSetRequestOps =
    new UpdateStackSetRequestOps(v)

}
