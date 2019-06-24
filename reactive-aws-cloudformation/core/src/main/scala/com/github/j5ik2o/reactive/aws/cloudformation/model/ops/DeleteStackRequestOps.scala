// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DeleteStackRequestBuilderOps(val self: DeleteStackRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala(value: Option[String]): DeleteStackRequest.Builder = {
    value.fold(self) { v =>
      self.stackName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retainResourcesAsScala(value: Option[Seq[String]]): DeleteStackRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.retainResources(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala(value: Option[String]): DeleteStackRequest.Builder = {
    value.fold(self) { v =>
      self.roleARN(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala(value: Option[String]): DeleteStackRequest.Builder = {
    value.fold(self) { v =>
      self.clientRequestToken(v)
    }
  }

}

final class DeleteStackRequestOps(val self: DeleteStackRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stackNameAsScala: Option[String] = Option(self.stackName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retainResourcesAsScala: Option[Seq[String]] = Option(self.retainResources).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def roleARNAsScala: Option[String] = Option(self.roleARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientRequestTokenAsScala: Option[String] = Option(self.clientRequestToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteStackRequestOps {

  implicit def toDeleteStackRequestBuilderOps(v: DeleteStackRequest.Builder): DeleteStackRequestBuilderOps =
    new DeleteStackRequestBuilderOps(v)

  implicit def toDeleteStackRequestOps(v: DeleteStackRequest): DeleteStackRequestOps = new DeleteStackRequestOps(v)

}
