package genetic;
import java.util.ArrayList;
class Thought98 extends Thought{
private static ArrayList<Thought98> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 860.9412961295378;
private double fd1 = 764.2563027241265;
private Thought fo0 = null;
private Thought fo1 = null;
Thought98 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought98 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought98 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought98 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought98 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought98 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought98 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought98 instance = new Thought98 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
        Output.points[1][2] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    double ld0 = 523.1558460932907;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fd0 = fd1 + ld0;
    double ld2 = 149.46218642816416;
    ld2 = fd0 + fd1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
    boolean lb3 = true;
    fb0 = fb1 || lb1;
    lb3 = fb0 && fb1;
    Output.points[1][3] -= ld0;
    ld2 = fd0 - fd1;

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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought392.getInstance(fo0, fo1, fo0, fo1);
    ab2 = fd0 < fd1;
    Output.points[1][4] -= fd0;
    ab3 = fd1 < fd0;
    boolean lb1 = true;
    Output.points[1][5] -= fd1;
    Thought lo2 = Thought237.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[1][6] += fd0;
    ab3 = !ab4;
    double ld3 = 339.5308607516066;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb1, ab1);
}
    ab2 = fd1 > ld3;
    fd0 = fd1 - ld3;
    Output.points[1][7] -= fd0;
        ab3 = !ab4;
    fd1 = ld3 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb0, fb1, lb1, ab1);
}
    double ld4 = 602.7806858765907;
    boolean lb5 = false;
    boolean lb6 = false;
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld3, ld4, lb6, ab1, ab2, ab3);
}
    fd0 = fd1 - ld3;
    boolean lb7 = false;
    ab3 = ab4 || fb0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb0 = fb1 || lb0;
        ad3 *= -1;
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
        fb0 = ad3 < ad4;
        fb1 = lb0 && fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          fo0.m3(fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
        lb0 = ad3 > ad4;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        boolean lb1 = false;
if(fo1 != null){
          lb1 = fo1.m2(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb1);
}
        lb0 = ad1 > ad2;
        Thought lo2 = Thought68.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb0);
        if (fb0) {
            fb1 = !lb1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            ad3 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            Output.points[1][8] += fd1;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Thought lo0 = Thought241.getInstance();
    boolean lb1 = true;
    ab1 = ab2 || ab3;
if(fo0 != null){
          fo0.m1(ab4, fb0, fb1, lb1);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb2 = true;
    ab1 = fd1 < ad1;
    boolean lb3 = true;
    double ld4 = 627.5084735080708;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb5 = true;
    boolean lb6 = false;
    lb5 = lb6 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, lb2, lb3, lb5);
}
    fd1 = ld4 + ad1;

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
    double ld0 = 199.33015213559247;
    Thought lo1 = Thought146.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought127.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    Output.points[2][0] -= ld0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fb1 = !fb0;
    fd0 *= -1;
    fd1 = ld0 - fd0;
    fb1 = fd1 < ld0;
    Thought lo3 = Thought271.getInstance(fd0, fd1, ld0, fd0);
    Output.points[2][1] += fd1;
    fb0 = fb1 || fb0;
    ld0 = fd0 - fd1;
    fb1 = ld0 < fd0;
    fb0 = fb1 && fb0;
    double ld4 = 541.2236083468476;
    fd0 = fd1 - ld0;
    if (fb1) {
        boolean lb5 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld4, fd0, fd1, ld0);
}
        lb5 = ld4 < fd0;
if(ao4 != null){
          ao4.m2();
}
if(fo0 != null){
          fo0.m3(fb0, fb1, lb5, fb0);
}
        for(int i0=0; i0<10; i0++){
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ld4, fd0, fb1, lb5, fb0, fb1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
        Thought lo2 = Thought231.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
        Output.points[2][2] += ad4;
        lb0 = !lb1;
        Thought lo3 = Thought53.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
        boolean lb4 = true;
        boolean lb5 = false;
        double ld6 = 80.2072210790443;
        boolean lb7 = true;
        for(int i1=0; i1<10; i1++){
            if (lb7) {
                boolean lb8 = true;
                ad2 = ad3 + ad4;
                fd0 = fd1 - ld6;
                ad1 = ad2 - ad3;
                lb7 = ad4 < fd0;
                Output.points[2][3] += fd1;
if(ao2 != null){
                  lb0 = ao2.m2();
}
}}}
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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = !ab3;
    Thought lo1 = Thought79.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    fd0 = fd1 + fd0;
    boolean lb2 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 || fb1;
    lb0 = lb2 || ab1;
if(ao3 != null){
      fd1 = ao3.m3();
}
    Output.points[2][4] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
if(ao4 != null){
      fd1 = ao4.m3(ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, lb2, lb3, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Thought lo0 = Thought166.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    ad4 = fd0 + fd1;
    Thought lo1 = Thought100.getInstance(fo1, ao1, ao2, ao3);
    Output.points[2][5] += ad1;
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 < ad2;
if(ao4 != null){
      ao4.m2();
}
    ad3 = ad4 + fd0;
    if (ab1) {
        ab2 = !ab3;
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        Output.points[2][6] += ad3;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[2][7] += fd1;
    Thought lo0 = Thought309.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Output.points[2][8] -= fd0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[3][0] -= fd1;
    fb0 = fb1 || fb0;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    double ld0 = 424.623163755687;
if(fo1 != null){
          fo0 = fo1.m4();
}
    ab1 = fd0 > fd1;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    ld0 *= -1;
    ab2 = fd0 < fd1;
    double ld1 = 968.8824850859493;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ld0 = fo0.m3(ld1, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought119.getInstance(fd1, ld0, ld1, fd0);
    fb1 = ab1 && ab2;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
    ab2 = fd1 < ld0;
    ld1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ab3;
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
    Thought lo0 = Thought185.getInstance();
    Output.points[3][1] += ad1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought376.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    ad1 = ad2 - ad3;
    fb1 = !fb0;
    boolean lb2 = false;
    fb0 = !fb1;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb2);
}
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb2 = !fb0;
    boolean lb3 = true;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      lb0 = fo1.m2();
}
    boolean lb1 = true;
    ad2 *= -1;
    ad3 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = lb1 && ab1;
    Thought lo2 = Thought241.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    fb1 = ad2 < ad3;
    lb0 = lb1 || ab1;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);
}
    ad2 = ad3 - ad4;
    Thought lo3 = Thought96.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought269.getInstance();
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return ab1;
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
    Output.points[3][2] += fd0;
    double ld0 = 537.8220430786383;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    Output.points[3][3] += fd1;
    fb0 = ld0 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    double ld2 = 230.31188062003682;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Output.points[3][4] -= ad1;
    double ld1 = 854.7306650044042;
    boolean lb2 = false;
    Thought lo3 = Thought30.getInstance(ao2, ao3, ao4, fo0);
    lb2 = ad1 > ad2;
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld1);
}
    ad1 *= -1;
    fb0 = fb1 || lb0;
    ad2 = ad3 - ad4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 659.2412831308228;
        ab1 = fd0 > fd1;
    Thought lo1 = Thought387.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
    Output.points[3][5] -= fd0;
    fd1 = ld0 - fd0;
    fd1 *= -1;
    double ld2 = 469.3054216519821;
    ab2 = ld0 < ld2;
    ab3 = fd0 < fd1;
    ld0 = ld2 + fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m1(ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ld2, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld0;

Thought.STACK_COUNTER++;
return ab1;
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
    ab2 = !ab3;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > ad1;
    double ld0 = 146.94241376235814;
    double ld1 = 627.7365974731779;
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    double ld2 = 1.2477108639727836;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
    ab4 = fb0 && fb1;
    ld1 = ld2 - ad1;
    double ld3 = 765.0083726970388;
    boolean lb4 = true;
    Thought lo5 = Thought356.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 - ld0;
    ld1 = ld2 + ld3;
    double ld6 = 324.2136225590409;
    double ld7 = 82.28910065860586;
    for(int i0=0; i0<10; i0++){
        lb4 = ld6 < ld7;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        ab1 = fd0 < fd1;
        boolean lb8 = false;
        ab1 = !ab2;
        ab3 = !ab4;
if(ao2 != null){
          ao1 = ao2.m4();
}
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        double ld0 = 86.0928374191343;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ld0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = ld0 - fd0;
        fb1 = fd1 > ld0;
        boolean lb1 = true;
        Output.points[3][6] -= fd0;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
        ld0 = fd0 + fd1;
        Thought lo2 = Thought71.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
        fd1 = ld0 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        ld0 *= -1;
        Thought lo3 = Thought121.getInstance();
        fb0 = !fb1;
        Thought lo4 = Thought297.getInstance(lb1, fb0, fb1, lb1);
        boolean lb5 = true;
        boolean lb6 = true;
        Output.points[3][7] += fd0;
        lb5 = fd1 > ld0;
        boolean lb7 = true;
        boolean lb8 = false;
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
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    Thought lo0 = Thought86.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Output.points[3][8] -= fd0;
    double ld1 = 306.8884342930309;
    double ld2 = 61.162830413386686;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = ld2 < fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, fd0);
}
    double ld4 = 493.16531731378166;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
    if (ab3) {
        boolean lb5 = false;
        ab3 = ld4 > fd0;
        fd1 = ld1 - ld2;
if(fo0 != null){
          fo1 = fo0.m4();
}
        ld4 = fd0 - fd1;
if(fo1 != null){
          fo1.m1(ab4, fb0, fb1, lb5);
}
        boolean lb6 = false;
if(fo0 != null){
          lb6 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, ld4, fd0, lb3, ab1, ab2, ab3);
}
        ab4 = fd1 > ld1;
        ld2 *= -1;
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad2 *= -1;
    Thought lo0 = Thought76.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, ad1, ad2);
}
        fb0 = ad3 > ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo0.m1();
}
        fb1 = fb0 || fb1;
        boolean lb1 = false;
        lb1 = !fb0;
        boolean lb2 = true;
if(fo1 != null){
          fo1.m2(fb0, fb1, lb1, lb2);
}
        fb0 = ad3 > ad4;
}
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
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    Thought lo1 = Thought206.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    double ld2 = 670.2384317608041;
    boolean lb3 = true;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, lb3, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld2, ad1);
}
    ab2 = ab3 && ab4;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2);
}
    ab4 = !fb0;
    Thought lo5 = Thought202.getInstance();
    Output.points[4][0] += ad3;
    ad4 *= -1;
if(fo0 != null){
      fo0.m3(fb1, lb0, lb3, lb4);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[4][1] -= fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 42.751150114761934;
if(ao3 != null){
      fb0 = ao3.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 255.39440706132334;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    double ld2 = 991.9890913890063;
    fb1 = ld1 < ld2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fd0 > fd1;
    boolean lb3 = true;
    fb0 = ld0 > ld1;
    double ld4 = 284.318133799061;
    fb1 = lb3 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(ld2, ld4, fd0, fd1);
}
    double ld5 = 710.4937391829712;
    fb1 = lb3 || fb0;
    boolean lb6 = true;
    fb0 = fb1 && lb3;
    ld0 = ld1 + ld2;
    lb6 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld4, ld5, fd0, fd1);
}
    ld0 = ld1 + ld2;

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
    Thought lo0 = Thought276.getInstance();
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fb1 && fb0;
        Thought lo1 = Thought360.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
        Thought lo2 = Thought370.getInstance(ao1, ao2, ao3, ao4);
        fd0 = fd1 - ad1;
        fb1 = !fb0;
        fb1 = fb0 && fb1;
        Thought lo3 = Thought225.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
        boolean lb4 = false;
        if (lb4) {
            fb0 = ad4 < fd0;
            double ld5 = 328.183330840841;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2();
}
    Output.points[4][2] -= fd0;
    ab2 = fd1 < fd0;
    double ld0 = 35.95780365455055;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought286.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought396.getInstance(ao4, fo0, fo1, ao1);
    boolean lb3 = true;
if(ao2 != null){
      ao2.m1(ld0, fd0, fd1, ld0);
}
    Thought lo4 = Thought183.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
if(ao1 != null){
      ao1.m3();
}
    lb3 = fd1 < ld0;
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
    Output.points[4][3] += fd0;
    fb0 = !fb1;
    Output.points[4][4] -= fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, lb3, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m3(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb3);
}
    double ld5 = 647.0855381131722;

Thought.STACK_COUNTER++;
return ld0;
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought385.getInstance(fo1, ao1, ao2, ao3);
    fb1 = ad2 > ad3;
    boolean lb1 = false;
    lb1 = ab1 || ab2;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
    ab3 = !ab4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo1.m3();
}
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && ab1;
    ad2 = ad3 + ad4;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    Output.points[4][5] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought244.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    if (fb0) {
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        Output.points[4][6] -= fd1;
        fd0 = fd1 + fd0;
        double ld3 = 417.5147340256166;
if(fo1 != null){
          fo1.m1();
}
        Thought lo4 = Thought361.getInstance(fb1, lb0, lb1, fb0);
        boolean lb5 = true;
        fb0 = fd0 > fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, lb5, lb0, lb1, fb0);
}
        double ld6 = 816.463994405755;
        boolean lb7 = true;
        } else {
        lb0 = lb1 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought253.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fb1 && ab1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    Output.points[4][7] -= fd0;
if(fo1 != null){
      lb2 = fo1.m2(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);

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
    Thought lo0 = Thought319.getInstance();
    fb0 = ad2 < ad3;
    ad4 *= -1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
    lb2 = ad1 > ad2;
    lb3 = ad3 > ad4;
    Thought lo4 = Thought109.getInstance(fd0, fd1, ad1, ad2);
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb6 = false;
    Output.points[4][8] -= ad1;
    lb5 = ad2 > ad3;

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
    ab1 = ab2 && ab3;
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
        ab3 = ad2 < ad3;
        Thought lo0 = Thought307.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
        } else {
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        ab3 = fd1 > ad1;
        ad2 = ad3 + ad4;
        Thought lo1 = Thought44.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
        ab2 = ab3 && ab4;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = !ab1;
        ad1 = ad2 - ad3;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        fb0 = fd1 < fd0;
        boolean lb0 = true;
        fd1 *= -1;
        boolean lb1 = false;
        lb1 = fd0 > fd1;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fb0 = !fb1;
        }
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    ad2 *= -1;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad1 *= -1;
    fb1 = fb0 || fb1;
    double ld0 = 80.52726097187254;
    ad1 *= -1;
    boolean lb1 = false;
    ad2 *= -1;
    lb1 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fd0, fd1, ld0, ad1);
}
        ad2 = ad3 + ad4;
        fb0 = fb1 || lb1;
        fd0 = fd1 - ld0;
        boolean lb2 = true;
        ad1 = ad2 - ad3;
        }
    ad4 *= -1;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
}
    double ld3 = 34.79361508237498;
if(fo1 != null){
      fo1.m1();
}

Thought.STACK_COUNTER++;
return ao1;
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
      ao2.m3(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    double ld0 = 73.8252672020371;
    fd0 = fd1 - ld0;
                for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought159.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
        boolean lb2 = false;
        boolean lb3 = false;
}
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
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    Output.points[5][0] += ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ab3 = ao3.m2();
}
    ab4 = fd1 > ad1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
    double ld0 = 233.85004616998202;
    Thought lo1 = Thought327.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    ab1 = fd0 > fd1;
    ab2 = ab3 && ab4;
        fb0 = ld0 > ad1;
    fb1 = !ab1;
    Thought lo2 = Thought202.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fb1 = fd1 > ld0;
    ad1 *= -1;
    ab1 = ad2 < ad3;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[5][1] += fd0;
        boolean lb0 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought69.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
        boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    boolean lb3 = false;
    boolean lb4 = false;
    Output.points[5][2] -= fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, lb4, lb5, fb0);
}
    fb1 = fd0 > fd1;

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
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought291.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    lb2 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    Thought lo3 = Thought217.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);

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
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    fd1 *= -1;
    Thought lo1 = Thought203.getInstance(lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    double ld2 = 2.8696214482722446;
    boolean lb3 = false;
    ld2 = fd0 - fd1;
    ld2 *= -1;
    lb3 = fb0 && fb1;
    fd0 *= -1;
    lb0 = fd1 < ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
    ld2 = fd0 - fd1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1);
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
