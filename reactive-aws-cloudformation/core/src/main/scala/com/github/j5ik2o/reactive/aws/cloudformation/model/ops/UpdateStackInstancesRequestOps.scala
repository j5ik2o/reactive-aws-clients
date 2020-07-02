// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class UpdateStackInstancesRequestBuilderOps(val self: UpdateStackInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): UpdateStackInstancesRequest.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountsAsScala(value: Option[Seq[String]]): UpdateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.accounts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentTargetsAsScala(value: Option[DeploymentTargets]): UpdateStackInstancesRequest.Builder = {
    value.fold(self) { v => self.deploymentTargets(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsAsScala(value: Option[Seq[String]]): UpdateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.regions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterOverridesAsScala(value: Option[Seq[Parameter]]): UpdateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameterOverrides(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationPreferencesAsScala(
      value: Option[StackSetOperationPreferences]
  ): UpdateStackInstancesRequest.Builder = {
    value.fold(self) { v => self.operationPreferences(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): UpdateStackInstancesRequest.Builder = {
    value.fold(self) { v => self.operationId(v) }
  }

}

final class UpdateStackInstancesRequestOps(val self: UpdateStackInstancesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountsAsScala: Option[Seq[String]] =
    Option(self.accounts).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentTargetsAsScala: Option[DeploymentTargets] = Option(self.deploymentTargets)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsAsScala: Option[Seq[String]] =
    Option(self.regions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterOverridesAsScala: Option[Seq[Parameter]] =
    Option(self.parameterOverrides).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] = Option(self.operationPreferences)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala: Option[String] = Option(self.operationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateStackInstancesRequestOps {

  implicit def toUpdateStackInstancesRequestBuilderOps(
      v: UpdateStackInstancesRequest.Builder
  ): UpdateStackInstancesRequestBuilderOps = new UpdateStackInstancesRequestBuilderOps(v)

  implicit def toUpdateStackInstancesRequestOps(v: UpdateStackInstancesRequest): UpdateStackInstancesRequestOps =
    new UpdateStackInstancesRequestOps(v)

}
