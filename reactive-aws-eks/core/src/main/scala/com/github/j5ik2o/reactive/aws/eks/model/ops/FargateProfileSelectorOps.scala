// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class FargateProfileSelectorBuilderOps(val self: FargateProfileSelector.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): FargateProfileSelector.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala(value: Option[Map[String, String]]): FargateProfileSelector.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.labels(v.asJava)
    }
  }

}

final class FargateProfileSelectorOps(val self: FargateProfileSelector) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelsAsScala: Option[Map[String, String]] = Option(self.labels).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFargateProfileSelectorOps {

  implicit def toFargateProfileSelectorBuilderOps(v: FargateProfileSelector.Builder): FargateProfileSelectorBuilderOps =
    new FargateProfileSelectorBuilderOps(v)

  implicit def toFargateProfileSelectorOps(v: FargateProfileSelector): FargateProfileSelectorOps =
    new FargateProfileSelectorOps(v)

}
