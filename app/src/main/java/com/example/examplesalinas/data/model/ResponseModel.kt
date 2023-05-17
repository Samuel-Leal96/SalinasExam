package com.example.examplesalinas.data.model

import com.google.gson.annotations.SerializedName

class ResponseModel : ArrayList<ResponseModelItem>()

data class ResponseModelItem(
    @SerializedName("affiliations")val affiliations: List<String>,
    @SerializedName("apprentices")val apprentices: List<String>,
    @SerializedName("armament")val armament: List<String>,
    @SerializedName("born")val born: Int,
    @SerializedName("bornLocation")val bornLocation: String,
    @SerializedName("class")val `class`: String,
    @SerializedName("creator")val creator: String,
    @SerializedName("cybernetics")val cybernetics: String,
    @SerializedName("dateCreated")val dateCreated: Int,
    @SerializedName("dateDestroyed")val dateDestroyed: Int,
    @SerializedName("degree")val degree: String,
    @SerializedName("destroyedLocation")val destroyedLocation: String,
    @SerializedName("died")val died: Int,
    @SerializedName("diedLocation")val diedLocation: String,
    @SerializedName("equipment")val equipment: String,
    @SerializedName("era")val era: List<String>,
    @SerializedName("eyeColor")val eyeColor: String,
    @SerializedName("formerAffiliations")val formerAffiliations: List<String>,
    @SerializedName("gender")val gender: String,
    @SerializedName("hairColor")val hairColor: String,
    @SerializedName("height")val height: Double,
    @SerializedName("homeworld")val homeworld: String,
    @SerializedName("id")val id: Int,
    @SerializedName("image")val image: String,
    @SerializedName("kajidic")val kajidic: String,
    @SerializedName("manufacturer")val manufacturer: String,
    @SerializedName("mass")val mass: Double,
    @SerializedName("masters")val masters: List<String>,
    @SerializedName("model")val model: String,
    @SerializedName("name")val name: String,
    @SerializedName("platingColor")val platingColor: String,
    @SerializedName("productLine")val productLine: String,
    @SerializedName("sensorColor")val sensorColor: String,
    @SerializedName("skinColor")val skinColor: String,
    @SerializedName("species")val species: String,
    @SerializedName("wiki")val wiki: String
)