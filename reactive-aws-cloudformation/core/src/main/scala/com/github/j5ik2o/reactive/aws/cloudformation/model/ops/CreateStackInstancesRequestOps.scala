// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackInstancesRequestBuilderOps(val self: CreateStackInstancesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackSetNameAsScala(value: Option[String]): CreateStackInstancesRequest.Builder = {
    value.fold(self) { v => self.stackSetName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountsAsScala(value: Option[Seq[String]]): CreateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.accounts(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deploymentTargetsAsScala(value: Option[DeploymentTargets]): CreateStackInstancesRequest.Builder = {
    value.fold(self) { v => self.deploymentTargets(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def regionsAsScala(value: Option[Seq[String]]): CreateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.regions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parameterOverridesAsScala(value: Option[Seq[Parameter]]): CreateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameterOverrides(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationPreferencesAsScala(
      value: Option[StackSetOperationPreferences]
  ): CreateStackInstancesRequest.Builder = {
    value.fold(self) { v => self.operationPreferences(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationIdAsScala(value: Option[String]): CreateStackInstancesRequest.Builder = {
    value.fold(self) { v => self.operationId(v) }
  }

}

final class CreateStackInstancesRequestOps(val self: CreateStackInstancesRequest) extends AnyVal {

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
trait ToCreateStackInstancesRequestOps {

  implicit def toCreateStackInstancesRequestBuilderOps(
      v: CreateStackInstancesRequest.Builder
  ): CreateStackInstancesRequestBuilderOps = new CreateStackInstancesRequestBuilderOps(v)

  implicit def toCreateStackInstancesRequestOps(v: CreateStackInstancesRequest): CreateStackInstancesRequestOps =
    new CreateStackInstancesRequestOps(v)

}
