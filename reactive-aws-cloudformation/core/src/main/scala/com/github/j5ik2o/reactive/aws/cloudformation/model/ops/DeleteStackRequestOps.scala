// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackRequestBuilderOps(val self: DeleteStackRequest.Builder) extends AnyVal {

  final def stackNameAsScala(value: Option[String]): DeleteStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  } // String

  final def retainResourcesAsScala(value: Option[Seq[String]]): DeleteStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.retainResources(v.asJava)
    } // Seq[String]
  }

  final def roleARNAsScala(value: Option[String]): DeleteStackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  } // String

  final def clientRequestTokenAsScala(value: Option[String]): DeleteStackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  } // String

}

final class DeleteStackRequestOps(val self: DeleteStackRequest) extends AnyVal {

  final def stackNameAsScala: Option[String] = Option(self.stackName) // String

  final def retainResourcesAsScala: Option[Seq[String]] = Option(self.retainResources).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def roleARNAsScala: Option[String] = Option(self.roleARN) // String

  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackRequestOps {

  implicit def toDeleteStackRequestBuilderOps(v: DeleteStackRequest.Builder): DeleteStackRequestBuilderOps =
    new DeleteStackRequestBuilderOps(v)

  implicit def toDeleteStackRequestOps(v: DeleteStackRequest): DeleteStackRequestOps = new DeleteStackRequestOps(v)

}
