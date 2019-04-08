// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackInstancesRequestBuilderOps(val self: DeleteStackInstancesRequest.Builder) extends AnyVal {

  final def stackSetNameAsScala(value: Option[String]): DeleteStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.stackSetName(v)
    }
  } // String

  final def accountsAsScala(value: Option[Seq[String]]): DeleteStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.accounts(v.asJava)
    } // Seq[String]
  }

  final def regionsAsScala(value: Option[Seq[String]]): DeleteStackInstancesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.regions(v.asJava)
    } // Seq[String]
  }

  final def operationPreferencesAsScala(
      value: Option[StackSetOperationPreferences]
  ): DeleteStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.operationPreferences(v)
    }
  } // StackSetOperationPreferences

  final def retainStacksAsScala(value: Option[Boolean]): DeleteStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.retainStacks(v)
    }
  } // Boolean

  final def operationIdAsScala(value: Option[String]): DeleteStackInstancesRequest.Builder = {
    value.fold(self) { v =>
      self.operationId(v)
    }
  } // String

}

final class DeleteStackInstancesRequestOps(val self: DeleteStackInstancesRequest) extends AnyVal {

  final def stackSetNameAsScala: Option[String] = Option(self.stackSetName) // String

  final def accountsAsScala: Option[Seq[String]] = Option(self.accounts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def regionsAsScala: Option[Seq[String]] = Option(self.regions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def operationPreferencesAsScala: Option[StackSetOperationPreferences] =
    Option(self.operationPreferences) // StackSetOperationPreferences

  final def retainStacksAsScala: Option[Boolean] = Option(self.retainStacks) // Boolean

  final def operationIdAsScala: Option[String] = Option(self.operationId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackInstancesRequestOps {

  implicit def toDeleteStackInstancesRequestBuilderOps(
      v: DeleteStackInstancesRequest.Builder
  ): DeleteStackInstancesRequestBuilderOps = new DeleteStackInstancesRequestBuilderOps(v)

  implicit def toDeleteStackInstancesRequestOps(v: DeleteStackInstancesRequest): DeleteStackInstancesRequestOps =
    new DeleteStackInstancesRequestOps(v)

}
