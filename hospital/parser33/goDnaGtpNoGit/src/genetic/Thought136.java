package genetic;
import java.util.ArrayList;
class Thought136 extends Thought{
private static ArrayList<Thought136> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 585.2869515390555;
private double fd1 = 777.4366027623153;
private Thought fo0 = null;
private Thought fo1 = null;
Thought136 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought136 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought136 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought136 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought136 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought136 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought136 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought136 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought136 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought136 instance = new Thought136 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought136 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought136 instance = new Thought136 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought136 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought136 instance = new Thought136 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought136 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought136 instance = new Thought136 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought136 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought136 instance = new Thought136 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought136 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought136 instance = new Thought136 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought136 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought136 instance = new Thought136 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought136 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought136 instance = new Thought136 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought204.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Thought lo1 = Thought50.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
if(fo0 != null){
          fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb2, fb0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb2);
}
        fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fb1 = !lb2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[6][8] -= fd1;
    ab1 = fd0 < fd1;
    double ld0 = 546.5398921354863;
    Thought lo1 = Thought77.getInstance(ld0, fd0, fd1, ld0);
    fd0 = fd1 + ld0;
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab2 = !ab3;
        if (ab4) {
if(fo1 != null){
          ld0 = fo1.m3();
}
        double ld2 = 214.5757663701197;
        double ld3 = 391.0127909568178;
        Output.points[7][0] -= ld3;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
        Thought lo4 = Thought351.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
if(fo0 != null){
          ld3 = fo0.m3(ld0, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
        ld3 = ld0 + fd0;
        for(int i0=0; i0<10; i0++){
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought45.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo3 = Thought14.getInstance(lb2, fb0, fb1, lb1);
    boolean lb4 = true;
    ad1 = ad2 - ad3;
    Output.points[7][1] -= ad4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    Output.points[7][2] -= ad2;
    ab1 = !ab2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought398.getInstance(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 762.1133999568312;
if(fo0 != null){
      ab4 = fo0.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
    double ld3 = 360.1236920573475;
    double ld4 = 182.35108335386226;
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    Thought lo5 = Thought246.getInstance();
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 280.0775363750374;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
    double ld1 = 948.9988523271404;
    boolean lb2 = false;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
    double ld3 = 121.75159704977806;
if(ao4 != null){
      ao4.m1(ld1, ld3, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = !lb2;
    fb0 = fb1 || lb2;
    Output.points[7][3] -= ld0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb2, fb0);
}
    Thought lo4 = Thought386.getInstance(fo0, fo1, ao1, ao2);
    ld1 = ld3 - fd0;
    fb1 = fd1 > ld0;
if(ao4 != null){
      ao3 = ao4.m4(ld1, ld3, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought325.getInstance();
    Thought lo1 = Thought100.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = true;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb2, fb0);
}
    ad2 = ad3 + ad4;
    Thought lo3 = Thought105.getInstance(ao1, ao2, ao3, ao4, fb1, lb2, fb0, fb1);
    lb2 = fd0 < fd1;
    Output.points[7][4] += ad1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ab2 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ab4 = ao4.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ab1 = !ab2;
    ab3 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    fb1 = !ab1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ab2 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    Output.points[7][5] -= ad1;
    fb0 = fb1 && ab1;
    double ld0 = 225.04493047378506;
    boolean lb1 = true;
    ad1 *= -1;
    Output.points[7][6] += ad2;
    Thought lo2 = Thought379.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao3.m1(ld0, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
    ad4 *= -1;
    ab2 = !ab3;
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[7][7] += fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    lb0 = fb0 || fb1;
    fd0 = fd1 + fd0;
    lb0 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought30.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    boolean lb4 = true;
if(fo0 != null){
      lb3 = fo0.m2(lb4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    if (fb0) {
        Thought lo0 = Thought231.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        Thought lo1 = Thought374.getInstance(fo1, fo0, fo1, fo0);
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
        fd1 = fd0 - fd1;
        boolean lb3 = true;
        fd0 = fd1 - fd0;
        ab1 = !ab2;
        ab3 = fd1 < fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
        Thought lo4 = Thought47.getInstance(ab4, fb0, fb1, lb2);
        Thought lo5 = Thought271.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
        ab4 = !fb0;
        Thought lo6 = Thought34.getInstance(fd0, fd1, fd0, fd1, fb1, lb2, lb3, ab1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        double ld7 = 725.6624376718102;
        Thought lo8 = Thought9.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fo0.m2(ld7, fd0, fd1, ld7);
}
        fd0 = fd1 - ld7;
        boolean lb9 = false;
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Output.points[7][8] += fd0;
    boolean lb0 = false;
    fb0 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    ad2 *= -1;
        lb0 = fb0 || fb1;
    Output.points[8][0] -= ad3;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought34.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = false;
    fd0 = fd1 - ad1;
    boolean lb2 = false;
    lb2 = ab1 || ab2;
    double ld3 = 90.26716552070666;
if(fo1 != null){
      ab3 = fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ld3 - ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    if (ab4) {
if(fo1 != null){
          fd1 = fo1.m3();
}
        ld3 = ad1 + ad2;
        Output.points[8][1] -= ad3;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][2] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[8][3] += fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[8][4] += fd1;
    double ld0 = 545.7573098357562;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought327.getInstance(ld0, fd0, fd1, ld0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}
    lb1 = fd1 < ld0;
    fd0 = fd1 + ld0;
    Thought lo3 = Thought170.getInstance();
if(ao2 != null){
      ao2.m1(fb0, fb1, lb1, fb0);
}
    fd0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = ld0 < fd0;
if(ao2 != null){
          fb1 = ao2.m2(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
        if (fb1) {
}}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
    fb1 = !fb0;
    boolean lb0 = false;
    boolean lb1 = true;
    Output.points[8][5] -= fd1;
    ad1 = ad2 - ad3;
    lb1 = !fb0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought190.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought72.getInstance(ao4, fo0, fo1, ao1);
    lb1 = !ab1;
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    Output.points[8][6] -= fd0;

Thought.STACK_COUNTER++;
return ab4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld0 = 445.0516518094533;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m3();
}
    boolean lb1 = true;
    double ld2 = 786.2921232115738;
    ad3 = ad4 + fd0;
    fb0 = fb1 && lb1;
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        Thought lo3 = Thought259.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ld2, ad1, lb1, ab1, ab2, ab3);
        ad2 = ad3 - ad4;
        double ld4 = 694.4016006852877;
if(ao2 != null){
          ab4 = ao2.m2(ad4, fd0, fd1, ld4, fb0, fb1, lb1, ab1);
}
        ld0 = ld2 + ad1;
        double ld5 = 137.54704163188276;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        double ld6 = 702.4434864671216;
        ld2 = ad1 - ad2;
        Thought lo7 = Thought309.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[8][7] -= fd0;
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought179.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    boolean lb2 = false;
    Thought lo3 = Thought203.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb4 = false;
    ab4 = fb0 || fb1;
    boolean lb5 = true;
    boolean lb6 = false;
    fd0 = fd1 - fd0;
    Thought lo7 = Thought220.getInstance(fd1, fd0, fd1, fd0, lb1, lb2, lb4, lb5);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb6, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    lb1 = fd0 > fd1;
    fd0 *= -1;
    boolean lb8 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    lb2 = lb4 && lb5;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought300.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
    Thought lo1 = Thought77.getInstance(fb0, fb1, fb0, fb1);
    Thought lo2 = Thought124.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad4 *= -1;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    lb4 = ad3 > ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ab2 && ab3;
    if (ab4) {
        fd1 = ad1 - ad2;
if(fo1 != null){
          ad3 = fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
        ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ab4 = fb0 || fb1;
        boolean lb0 = true;
        boolean lb1 = true;
        ad2 *= -1;
        boolean lb2 = true;
if(fo0 != null){
          lb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 - ad3;
        Output.points[8][8] -= ad4;
        lb1 = lb2 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
        ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(ab2, ab3, ab4, fb0);
}
        Output.points[0][0] -= ad1;
        boolean lb3 = false;
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought52.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought98.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      fb1 = ao4.m2(fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
    Thought lo3 = Thought22.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
    double ld4 = 450.9267048958369;
    fb0 = fd0 > fd1;
    ld4 = fd0 + fd1;
    boolean lb5 = true;
    ld4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
        fb0 = fb1 && lb1;

Thought.STACK_COUNTER++;
return ld4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    double ld0 = 901.9073018395131;
    ad2 = ad3 - ad4;
    fb1 = !fb0;
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought298.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ld0;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought160.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    Output.points[0][1] -= fd1;
    double ld3 = 545.3751234252741;
    ld0 = ld3 + ad1;
    boolean lb4 = false;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    ab3 = ab4 || fb0;
    double ld1 = 298.66427777848617;
    Output.points[0][2] -= ld1;
    fb1 = fd0 < fd1;
    ld1 = fd0 - fd1;
    lb0 = ld1 > fd0;
    fd1 = ld1 - fd0;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(fd1, ld1, fd0, fd1);
}
    double ld2 = 450.75384873652996;
    Output.points[0][3] += ld1;
    ab4 = fb0 || fb1;

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        Output.points[0][4] -= ad1;
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        Thought lo0 = Thought185.getInstance();
        fb1 = ab1 && ab2;
        Output.points[0][5] += fd1;
}
Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    if (fb1) {
        fb0 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        Thought lo1 = Thought11.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb2 = false;
        fb0 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Output.points[0][6] -= fd0;
    boolean lb0 = false;
    Thought lo1 = Thought269.getInstance(fb0, fb1, lb0, ab1);
    double ld2 = 343.40503219102067;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld2 = fd0 - fd1;
if(fo0 != null){
      fb1 = fo0.m2(ld2, fd0, fd1, ld2, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 - ld2;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
        fd1 = ld2 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 && ab3;
    fd1 = ld2 + fd0;
    Thought lo3 = Thought133.getInstance(fd1, ld2, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m2();
}
    Thought lo1 = Thought225.getInstance(lb0, fb0, fb1, lb0);
    Thought lo2 = Thought351.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    boolean lb3 = false;
if(fo1 != null){
          lb3 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    boolean lb4 = true;
    lb4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    lb0 = lb3 || lb4;
    Thought lo5 = Thought391.getInstance();
    fb0 = ad3 < ad4;
    fb1 = !lb0;
if(fo0 != null){
      fo0.m3(lb3, lb4, fb0, fb1);
}
        lb0 = lb3 && lb4;
        fb0 = fd0 < fd1;
    fb1 = lb0 && lb3;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][7] -= ad1;
    ab1 = ab2 || ab3;
    ad2 *= -1;
    ab4 = fb0 && fb1;
    double ld0 = 585.544415061715;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    Thought lo2 = Thought121.getInstance(fd1, ld0, ad1, ad2, ab4, fb0, fb1, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb1;
    ad3 = ad4 - fd0;
    ab1 = ab2 || ab3;
    ab4 = fd1 < ld0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
    if (fb0) {
        fd1 = fd0 - fd1;
        fb1 = fb0 && fb1;
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb0 = fb1 && fb0;
        fb1 = fd1 > fd0;
        fb0 = fd1 < fd0;
if(ao4 != null){
          fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - fd0;
        fd1 *= -1;
        fb0 = !fb1;
        } else {
        double ld0 = 555.5409337823475;
if(ao4 != null){
          fb0 = ao4.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
        if (fb0) {
            fb1 = fd0 < fd1;
            ld0 *= -1;
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3);
}
            if (fb0) {
}}}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought99.getInstance(fd0, fd1, ad1, ad2);
    boolean lb1 = false;
    ad3 *= -1;
    lb1 = fb0 || fb1;
    lb1 = fb0 && fb1;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4();
}
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb1);
}
    lb2 = fb0 || fb1;
    double ld3 = 344.4650378441521;
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0, lb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought303.getInstance(fo1, ao1, ao2, ao3, lb1, lb2, fb0, fb1);
    boolean lb5 = false;
    boolean lb6 = false;
    Output.points[0][8] -= fd1;
    ld3 = ad1 - ad2;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ad3 = ad4 - fd0;
    lb2 = fd1 < ld3;
    ad1 *= -1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought281.getInstance(fb1, lb0, ab1, ab2);
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Output.points[1][0] -= fd1;
    Output.points[1][1] -= fd0;
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought2.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 = ad3 + ad4;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    if (lb0) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
        double ld1 = 220.5634824998836;
if(ao4 != null){
          ao4.m3();
}
        ab1 = !ab2;
        boolean lb2 = false;
if(fo0 != null){
          fo0.m1(ab2, ab3, ab4, fb0);
}
        fb1 = lb2 || lb0;
        ab1 = ld1 > ad1;
        ab2 = ad2 < ad3;
        ab3 = !ab4;
        Output.points[1][2] -= ad4;
        fb0 = fb1 && lb2;
        fd0 *= -1;
        fd1 = ld1 + ad1;
        ad2 *= -1;
        lb0 = ad3 > ad4;
        ab1 = fd0 < fd1;
        Thought lo3 = Thought131.getInstance(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ld1, fb1, lb2, lb0, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
          ao4.m2(ad2, ad3, ad4, fd0);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[1][3] -= fd0;
    fd1 = fd0 - fd1;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    lb0 = fd0 < fd1;
    lb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd0 *= -1;
    double ld0 = 168.51632037538792;
    Output.points[1][4] -= fd0;
    boolean lb1 = false;
    lb1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    fd1 *= -1;
    fb0 = !fb1;
    double ld2 = 864.9564660154699;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[1][5] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2();
}
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought251.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
