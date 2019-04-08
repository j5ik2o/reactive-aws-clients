// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackInstancesRequestBuilderOps(val self: DeleteStackInstancesRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): DeleteStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  }

  final def accountsAsScala(value: Option[Seq[String]]): DeleteStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.accounts(v.asJava)
    }
  }

  final def regionsAsScala(value: Option[Seq[String]]): DeleteStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.regions(v.asJava)
    }
  }

  final def operationPreferencesAsScala(
      value: Option[StackSetOperationPreferences]
  ): DeleteStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.operationPreferences(v)
    }
  }

  final def retainStacksAsScala(value: Option[Boolean]): DeleteStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.retainStacks(v)
    }
  }

  final def operationIdAsScala(value: Option[String]): DeleteStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  }

}

final class DeleteStackInstancesRequestOps(val self: DeleteStackInstancesRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName)

  final def accountsAsScala: Option[Seq[String]] = Option(self.accounts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def regionsAsScala: Option[Seq[String]] = Option(self.regions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] = Option(self.operationPreferences)

  final def retainStacksAsScala: Option[Boolean] = Option(self.retainStacks)

  final def operationIdAsScala: Option[String] = Option(self.operationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackInstancesRequestOps {

  implicit def toDeleteStackInstancesRequestBuilderOps(
      v: DeleteStackInstancesRequest.Builder
  ): DeleteStackInstancesRequestBuilderOps = new DeleteStackInstancesRequestBuilderOps(v)

  implicit def toDeleteStackInstancesRequestOps(v: DeleteStackInstancesRequest): DeleteStackInstancesRequestOps =
    new DeleteStackInstancesRequestOps(v)

}
