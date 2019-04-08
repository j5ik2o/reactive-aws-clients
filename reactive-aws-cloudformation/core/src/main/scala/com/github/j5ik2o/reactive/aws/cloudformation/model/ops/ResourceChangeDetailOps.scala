// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ResourceChangeDetailBuilderOps(val self: ResourceChangeDetail.Builder) extends AnyVal {

  final def targetAsScala(value: Option[ResourceTargetDefinition]): ResourceChangeDetail.Builder = {
    value.fold(self) { v =>
      self.target(v)
    }
  } // ResourceTargetDefinition

  final def evaluationAsScala(value: Option[EvaluationType]): ResourceChangeDetail.Builder = {
    value.fold(self) { v =>
      self.evaluation(v)
    }
  } // String

  final def changeSourceAsScala(value: Option[ChangeSource]): ResourceChangeDetail.Builder = {
    value.fold(self) { v =>
      self.changeSource(v)
    }
  } // String

  final def causingEntityAsScala(value: Option[String]): ResourceChangeDetail.Builder = {
    value.fold(self) { v =>
      self.causingEntity(v)
    }
  } // String

}

final class ResourceChangeDetailOps(val self: ResourceChangeDetail) extends AnyVal {

  final def targetAsScala: Option[ResourceTargetDefinition] = Option(self.target) // ResourceTargetDefinition

  final def evaluationAsScala: Option[EvaluationType] = Option(self.evaluation) // String

  final def changeSourceAsScala: Option[ChangeSource] = Option(self.changeSource) // String

  final def causingEntityAsScala: Option[String] = Option(self.causingEntity) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceChangeDetailOps {

  implicit def toResourceChangeDetailBuilderOps(v: ResourceChangeDetail.Builder): ResourceChangeDetailBuilderOps =
    new ResourceChangeDetailBuilderOps(v)

  implicit def toResourceChangeDetailOps(v: ResourceChangeDetail): ResourceChangeDetailOps =
    new ResourceChangeDetailOps(v)

}
