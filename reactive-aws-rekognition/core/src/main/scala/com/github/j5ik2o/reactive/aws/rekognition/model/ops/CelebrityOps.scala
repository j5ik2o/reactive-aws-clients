// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class CelebrityBuilderOps(val self: Celebrity.Builder) extends AnyVal {

  final def urlsAsScala(value: Option[Seq[String]]): Celebrity.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.urls(v.asJava)
    }
  }

  final def nameAsScala(value: Option[String]): Celebrity.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def idAsScala(value: Option[String]): Celebrity.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def faceAsScala(value: Option[ComparedFace]): Celebrity.Builder = {
    value.fold(self) { v =>
      self.face(v)
    }
  }

  final def matchConfidenceAsScala(value: Option[Float]): Celebrity.Builder = {
    value.fold(self) { v =>
      self.matchConfidence(v)
    }
  }

}

final class CelebrityOps(val self: Celebrity) extends AnyVal {

  final def urlsAsScala: Option[Seq[String]] = Option(self.urls).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nameAsScala: Option[String] = Option(self.name)

  final def idAsScala: Option[String] = Option(self.id)

  final def faceAsScala: Option[ComparedFace] = Option(self.face)

  final def matchConfidenceAsScala: Option[Float] = Option(self.matchConfidence)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCelebrityOps {

  implicit def toCelebrityBuilderOps(v: Celebrity.Builder): CelebrityBuilderOps = new CelebrityBuilderOps(v)

  implicit def toCelebrityOps(v: Celebrity): CelebrityOps = new CelebrityOps(v)

}
