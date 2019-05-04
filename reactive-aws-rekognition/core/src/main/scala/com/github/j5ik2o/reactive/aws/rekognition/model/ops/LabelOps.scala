// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class LabelBuilderOps(val self: Label.Builder) extends AnyVal {

  final def nameAsScala(value: Option[String]): Label.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def confidenceAsScala(value: Option[Float]): Label.Builder = {
    value.fold(self) { v =>
      self.confidence(v)
    }
  }

  final def instancesAsScala(value: Option[Seq[Instance]]): Label.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.instances(v.asJava)
    }
  }

  final def parentsAsScala(value: Option[Seq[Parent]]): Label.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parents(v.asJava)
    }
  }

}

final class LabelOps(val self: Label) extends AnyVal {

  final def nameAsScala: Option[String] = Option(self.name)

  final def confidenceAsScala: Option[Float] = Option(self.confidence)

  final def instancesAsScala: Option[Seq[Instance]] = Option(self.instances).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def parentsAsScala: Option[Seq[Parent]] = Option(self.parents).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLabelOps {

  implicit def toLabelBuilderOps(v: Label.Builder): LabelBuilderOps = new LabelBuilderOps(v)

  implicit def toLabelOps(v: Label): LabelOps = new LabelOps(v)

}
