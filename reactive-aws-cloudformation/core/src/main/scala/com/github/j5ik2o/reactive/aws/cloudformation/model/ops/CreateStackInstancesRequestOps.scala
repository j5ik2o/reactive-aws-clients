// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class CreateStackInstancesRequestBuilderOps(val self: CreateStackInstancesRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): CreateStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

  final def accountsAsScala(value: Option[Seq[String]]): CreateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.accounts(v.asJava)
    } // Seq[String]
  }

  final def regionsAsScala(value: Option[Seq[String]]): CreateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.regions(v.asJava)
    } // Seq[String]
  }

  final def parameterOverridesAsScala(value: Option[Seq[Parameter]]): CreateStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameterOverrides(v.asJava)
    } // Seq[Parameter]
  }

  final def operationPreferencesAsScala(
      value: Option[StackSetOperationPreferences]
  ): CreateStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.operationPreferences(v)
    }
  } // StackSetOperationPreferences

  final def operationIdAsScala(value: Option[String]): CreateStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  } // String

}

final class CreateStackInstancesRequestOps(val self: CreateStackInstancesRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

  final def accountsAsScala: Option[Seq[String]] = Option(self.accounts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def regionsAsScala: Option[Seq[String]] = Option(self.regions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def parameterOverridesAsScala: Option[Seq[Parameter]] = Option(self.parameterOverrides).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Parameter]

  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] =
    Option(self.operationPreferences) // StackSetOperationPreferences

  final def operationIdAsScala: Option[String] = Option(self.operationId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateStackInstancesRequestOps {

  implicit def toCreateStackInstancesRequestBuilderOps(
      v: CreateStackInstancesRequest.Builder
  ): CreateStackInstancesRequestBuilderOps = new CreateStackInstancesRequestBuilderOps(v)

  implicit def toCreateStackInstancesRequestOps(v: CreateStackInstancesRequest): CreateStackInstancesRequestOps =
    new CreateStackInstancesRequestOps(v)

}
