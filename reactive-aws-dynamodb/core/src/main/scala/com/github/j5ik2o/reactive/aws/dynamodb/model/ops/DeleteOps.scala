// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class DeleteBuilderOps(val self: Delete.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def keyAsScala(value: Option[Map[String, AttributeValue]]): Delete.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.key(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala(value: Option[String]): Delete.Builder = {
            value.fold(self){ v => self.tableName(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def conditionExpressionAsScala(value: Option[String]): Delete.Builder = {
            value.fold(self){ v => self.conditionExpression(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def expressionAttributeNamesAsScala(value: Option[Map[String, String]]): Delete.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeNames(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def expressionAttributeValuesAsScala(value: Option[Map[String, AttributeValue]]): Delete.Builder = {
                value.filter(_.nonEmpty).fold(self){ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.expressionAttributeValues(v.asJava) } 
            }

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def returnValuesOnConditionCheckFailureAsScala(value: Option[ReturnValuesOnConditionCheckFailure]): Delete.Builder = {
            value.fold(self){ v => self.returnValuesOnConditionCheckFailure(v) }
            } 


}

final class DeleteOps(val self: Delete) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def keyAsScala: Option[Map[String, AttributeValue]]  = Option(self.key).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def tableNameAsScala: Option[String] = Option(self.tableName) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def conditionExpressionAsScala: Option[String] = Option(self.conditionExpression) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def expressionAttributeNamesAsScala: Option[Map[String, String]]  = Option(self.expressionAttributeNames).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
                final def expressionAttributeValuesAsScala: Option[Map[String, AttributeValue]]  = Option(self.expressionAttributeValues).map{ v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def returnValuesOnConditionCheckFailureAsScala: Option[ReturnValuesOnConditionCheckFailure] = Option(self.returnValuesOnConditionCheckFailure) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteOps {

implicit def toDeleteBuilderOps(v: Delete.Builder): DeleteBuilderOps = new DeleteBuilderOps(v)

implicit def toDeleteOps(v: Delete): DeleteOps = new DeleteOps(v)

}

