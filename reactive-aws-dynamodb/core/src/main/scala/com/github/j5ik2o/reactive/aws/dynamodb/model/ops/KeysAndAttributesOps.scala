// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class KeysAndAttributesBuilderOps(val self: KeysAndAttributes.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keysAsScala(value: Option[Seq[Map[String, AttributeValue]]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keys(v.map(_.asJava).asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesToGetAsScala(value: Option[Seq[String]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributesToGet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consistentReadAsScala(value: Option[Boolean]): KeysAndAttributes.Builder = {
    value.fold(self) { v =>
      self.consistentRead(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionExpressionAsScala(value: Option[String]): KeysAndAttributes.Builder = {
    value.fold(self) { v =>
      self.projectionExpression(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): KeysAndAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava)
    }
  }

}

final class KeysAndAttributesOps(val self: KeysAndAttributes) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keysAsScala: Option[Seq[Map[String, AttributeValue]]] = Option(self.keys).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.asScala.toMap)
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributesToGetAsScala: Option[Seq[String]] = Option(self.attributesToGet).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def consistentReadAsScala: Option[Boolean] = Option(self.consistentRead)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def projectionExpressionAsScala: Option[String] = Option(self.projectionExpression)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expressionAttributeNamesAsScala: Option[Map[String, String]] = Option(self.expressionAttributeNames).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToKeysAndAttributesOps {

  implicit def toKeysAndAttributesBuilderOps(v: KeysAndAttributes.Builder): KeysAndAttributesBuilderOps =
    new KeysAndAttributesBuilderOps(v)

  implicit def toKeysAndAttributesOps(v: KeysAndAttributes): KeysAndAttributesOps = new KeysAndAttributesOps(v)

}
