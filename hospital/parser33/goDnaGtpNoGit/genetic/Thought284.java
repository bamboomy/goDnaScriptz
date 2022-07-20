package genetic;
import java.util.ArrayList;
class Thought284 extends Thought{
private static ArrayList<Thought284> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 184.4498833861673;
private double fd1 = 625.400993717972;
private Thought fo0 = null;
private Thought fo1 = null;
Thought284 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought284 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought284 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought284 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought284 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought284 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought284 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought284 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought284 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought284 instance = new Thought284 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought284 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought284 instance = new Thought284 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought284 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought284 instance = new Thought284 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought284 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought284 instance = new Thought284 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought284 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought284 instance = new Thought284 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought284 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought284 instance = new Thought284 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought284 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought284 instance = new Thought284 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought284 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought284 instance = new Thought284 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought280.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Output.points[6][3] -= fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought125.getInstance(fd0, fd1, fd0, fd1);
    Output.points[6][4] += fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    double ld2 = 863.768618097994;
    Output.points[6][5] += fd0;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m2();
}
    fb0 = fb1 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    boolean lb0 = true;
    ab4 = fb0 || fb1;
        boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
    boolean lb2 = true;

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
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    ad2 *= -1;
    Thought lo1 = Thought368.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m1();
}
    Thought lo2 = Thought273.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      lb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && lb0;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 375.6396140440511;
    Output.points[6][6] -= ad1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought207.getInstance(ab3, ab4, fb0, fb1);
    boolean lb2 = true;
    Output.points[6][7] -= ad1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    ab4 = fb0 || fb1;
    Output.points[6][8] += fd1;
    Output.points[7][0] += ld0;
    lb2 = lb3 && ab1;
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
    Output.points[7][1] -= fd1;
    boolean lb4 = false;
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, lb4, ab1);
}
    fd0 = fd1 + ld0;
    ab2 = ad1 < ad2;
    ad3 = ad4 + fd0;
    ab3 = fd1 < ld0;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad4 *= -1;
    ab4 = fd0 < fd1;
    fb0 = ld0 > ad1;

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
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    double ld0 = 291.7453753730137;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    double ld1 = 849.0458479779788;
    fd0 = fd1 - ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = ld1 < fd0;
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    if (fb1) {
        double ld2 = 150.05564606598938;
        Output.points[7][2] -= fd0;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld2, ld0, ld1, fb0, fb1, fb0, fb1);
}
        Thought lo3 = Thought242.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
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
    ad2 *= -1;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    boolean lb0 = true;
    lb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
    boolean lb1 = true;
    Output.points[7][3] -= ad3;
    lb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    lb0 = lb1 || fb0;
    fb1 = lb0 || lb1;
    if (fb0) {
        fb1 = fd1 < ad1;
        Output.points[7][4] -= ad2;
        ad3 = ad4 + fd0;
        lb0 = lb1 && fb0;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fb1, lb0, lb1, fb0);
}
        fd1 = ad1 + ad2;
        ad3 = ad4 + fd0;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    if (ab3) {
        boolean lb0 = false;
        fd1 = fd0 - fd1;
        for(int i0=0; i0<10; i0++){
            Thought lo1 = Thought63.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
            fd0 *= -1;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
            for(int i1=0; i1<10; i1++){
if(ao1 != null){
                  fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
                ab4 = !fb0;
                Output.points[7][5] += fd1;
if(ao1 != null){
                  fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
                fb1 = lb0 && ab1;
                fd0 *= -1;
if(ao3 != null){
                  ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
                fd1 = fd0 - fd1;
                ab2 = fd0 < fd1;
if(ao3 != null){
                  ao2 = ao3.m4();
}
if(ao4 != null){
                  ab3 = ao4.m2(ab4, fb0, fb1, lb0);
}
                fd0 = fd1 + fd0;
if(fo1 != null){
                  fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
                Thought lo2 = Thought110.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
                Thought lo3 = Thought337.getInstance(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
                boolean lb4 = true;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    ab2 = ad4 < fd0;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
    fd1 = ad1 + ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    boolean lb1 = false;
    Output.points[7][6] -= ad4;
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || lb0;
    lb1 = ad3 > ad4;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    ad1 = ad2 + ad3;
    Output.points[7][7] += ad4;

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
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        double ld1 = 809.2856241041128;
        lb0 = !fb0;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          fo0.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
        fb0 = !fb1;
        fd0 *= -1;
        boolean lb2 = false;
        Thought lo3 = Thought8.getInstance(fd1, ld1, fd0, fd1, lb0, lb2, fb0, fb1);
        lb0 = lb2 && fb0;
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
        fd1 *= -1;
        fb1 = !lb0;
        double ld4 = 257.3388067556836;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld4, fd0, fd1);
}
        ld1 *= -1;
        lb2 = fb0 && fb1;
        if (lb0) {
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
              fo0.m2(lb2, fb0, fb1, lb0);
}
            ld4 = fd0 + fd1;
            for(int i1=0; i1<10; i1++){
if(fo0 != null){
                  fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld4, fd0, fd1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
                  fo1 = fo0.m4(ld1, ld4, fd0, fd1, lb2, fb0, fb1, lb0);
}
}}}
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
    fd0 *= -1;
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab1 = fd0 > fd1;
    if (ab2) {
        fd0 *= -1;
        boolean lb0 = true;
        fd1 *= -1;
        ab2 = !ab3;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        ab4 = fb0 || fb1;
        lb0 = fd0 > fd1;
        ab1 = ab2 && ab3;
        Output.points[7][8] += fd0;
        double ld1 = 101.34020166150452;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
        boolean lb2 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ab3 = fo1.m2(ab4, fb0, fb1, lb0);
}
        fd1 = ld1 + fd0;
        double ld3 = 240.55072974012592;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3, lb2, ab1, ab2, ab3);
}
        double ld4 = 443.30806098863786;
if(fo0 != null){
          ab4 = fo0.m2(ld4, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = ld3 > ld4;
        double ld5 = 371.29903153483986;
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
    fb0 = !fb1;
    fb0 = !fb1;
        fb0 = !fb1;
    Output.points[8][0] += ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(ad1, ad2, ad3, ad4);
}
    double ld0 = 370.0605045677105;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
    Output.points[8][1] += ad4;
    fd0 *= -1;

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
    ab1 = ab2 || ab3;
    Output.points[8][2] += ad1;
    Output.points[8][3] -= ad2;
if(fo1 != null){
      fo1.m1();
}
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 > fd1;
    ab3 = ad1 > ad2;
    ad3 = ad4 + fd0;
    ab4 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ad1;
    ab1 = ab2 && ab3;
    if (ab4) {
        Thought lo0 = Thought60.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
        Thought lo1 = Thought262.getInstance(fo0, fo1, fo0, fo1);
        ab3 = ab4 || fb0;
        ad2 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    Output.points[8][4] += fd1;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = ad2 < ad3;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought143.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    fd0 = fd1 - ad1;
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][5] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
        double ld0 = 877.8848747157253;
    ab2 = !ab3;
if(ao3 != null){
      ab4 = ao3.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ld0 > fd0;
    fd1 *= -1;
    ab1 = ld0 > fd0;
    boolean lb1 = false;
    Output.points[8][6] -= fd1;
    Output.points[8][7] += ld0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    double ld2 = 179.39307602919308;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = ad1 + ad2;
    ab3 = ad3 < ad4;
    fd0 *= -1;
    double ld0 = 219.72272437735413;
    ab4 = fb0 || fb1;
    Thought lo1 = Thought247.getInstance(fd0, fd1, ld0, ad1);
    ab1 = ab2 && ab3;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[8][8] -= ld0;
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    ab2 = ad1 < ad2;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo1 = Thought249.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    fd0 = fd1 + fd0;
    lb0 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
    Thought lo2 = Thought24.getInstance(fd0, fd1, fd0, fd1);
    lb0 = fd0 > fd1;
    if (fb0) {
        Output.points[0][0] -= fd0;
        fd1 = fd0 + fd1;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    ab1 = !ab2;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    Thought lo0 = Thought214.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    double ld1 = 286.6343772555503;
    ab2 = ab3 || ab4;
    Thought lo2 = Thought35.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ab3 = fd0 < fd1;
    ab4 = fb0 && fb1;
    ab1 = ld1 > fd0;
    fd1 = ld1 + fd0;
    fd1 *= -1;
    Output.points[0][1] -= ld1;
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
    for(int i0=0; i0<10; i0++){
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
        fb0 = ad3 > ad4;
    Thought lo0 = Thought152.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
    boolean lb2 = true;
    if (lb2) {
if(fo1 != null){
          fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ad1 = ad2 - ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        ad3 = ad4 - fd0;
        fd1 *= -1;
        lb1 = lb2 && fb0;
if(fo1 != null){
          fo1.m2();
}
        boolean lb3 = false;
        Thought lo4 = Thought215.getInstance(fb0, fb1, lb3, lb1);
        double ld5 = 37.230394311171366;
        ld5 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb3);
}
        lb1 = lb2 && fb0;
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(ld5, ad1, ad2, ad3, fb0, fb1, lb3, lb6);
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    Thought lo0 = Thought181.getInstance(fo1, fo0, fo1, fo0);
    ad2 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought56.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;

Thought.STACK_COUNTER++;
return ad4;
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
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought384.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought270.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
        Output.points[0][2] -= fd0;
        fd1 = fd0 + fd1;
        Output.points[0][3] -= fd0;
        fb1 = fd1 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        Thought lo2 = Thought217.getInstance(fd1, fd0, fd1, fd0);
        boolean lb3 = true;
        lb3 = fb0 && fb1;
        boolean lb4 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        lb3 = fd1 > fd0;
if(ao1 != null){
          lb4 = ao1.m2();
}
        fb0 = !fb1;
if(ao2 != null){
          lb3 = ao2.m2(lb4, fb0, fb1, lb3);
}
        fd1 = fd0 + fd1;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb4, fb0, fb1, lb3);
}
        double ld5 = 125.21384705454169;
        double ld6 = 783.8985013682342;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(ao2 != null){
      ad3 = ao2.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought347.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    ad2 = ad3 + ad4;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = !fb1;
    Thought lo1 = Thought295.getInstance(fd1, ad1, ad2, ad3);
    boolean lb2 = true;
    Output.points[0][4] += ad4;
    fd0 = fd1 - ad1;
    Thought lo3 = Thought168.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ao1.m3(lb2, fb0, fb1, lb2);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    Thought lo4 = Thought151.getInstance(fd0, fd1, ad1, ad2, fb1, lb2, fb0, fb1);

Thought.STACK_COUNTER++;
return ad3;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought327.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    ab4 = !fb0;
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4();
}
        if (lb1) {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][5] -= ad1;
    ab2 = ad2 < ad3;
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    Output.points[0][6] += ad4;
    lb0 = fd0 > fd1;
    ad1 *= -1;
    ab1 = ad2 > ad3;
    ab2 = ad4 < fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    lb0 = ad3 > ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
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
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[0][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    Thought lo1 = Thought222.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    boolean lb2 = false;
    boolean lb3 = true;
    Thought lo4 = Thought145.getInstance(fo0, fo1, fo0, fo1, lb0, lb2, lb3, fb0);
    fb1 = lb0 || lb2;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb5 = false;
    lb3 = lb5 || fb0;
    fb1 = fd0 < fd1;
    lb0 = lb2 && lb3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        boolean lb6 = true;
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 862.7305196181096;
    ld0 = fd0 - fd1;
    Output.points[0][8] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
if(fo0 != null){
          fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
        fb0 = ld0 > fd0;
    fb1 = fd1 > ld0;
    lb1 = ab1 || ab2;
    fd0 *= -1;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = ld0 < fd0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld2 = 798.509351749281;
    Output.points[1][0] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = false;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 999.233320771093;
if(fo1 != null){
      ad2 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Output.points[1][1] += ad4;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        fb1 = fb0 || fb1;
        ld0 *= -1;
        fb0 = fb1 || fb0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    boolean lb1 = true;
    double ld2 = 919.7665279921508;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
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
    fb0 = !fb1;
if(ao2 != null){
      fd0 = ao2.m3();
}
    double ld0 = 686.9128412891247;
    Output.points[1][2] -= fd0;
if(ao3 != null){
      ao3.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
    fb1 = fb0 || fb1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        ld0 = fd0 - fd1;
        fb1 = fb0 && fb1;
        fb0 = ld0 < fd0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought398.getInstance(ao1, ao2, ao3, ao4);
    ad1 = ad2 + ad3;
    double ld1 = 307.6661604524876;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb3 = true;
    lb3 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    lb2 = fd1 < ld1;
    lb3 = !fb0;
    boolean lb4 = false;
    double ld5 = 569.2185083690406;

Thought.STACK_COUNTER++;
return ao2;
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
    boolean lb0 = false;
    Thought lo1 = Thought282.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = ab3 || ab4;
    Thought lo2 = Thought72.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    ab3 = !ab4;
    fd1 = fd0 + fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 > fd1;
    Thought lo3 = Thought266.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
    Thought lo0 = Thought70.getInstance();
    boolean lb1 = false;
    double ld2 = 483.43447911624475;
    ab1 = ab2 || ab3;
    double ld3 = 672.6486135609509;
    double ld4 = 141.7863857203279;
    ab4 = fb0 && fb1;
    lb1 = ld4 > ad1;
    ad2 *= -1;
    ab1 = ad3 > ad4;
    ab2 = !ab3;
    Output.points[1][3] -= fd0;
    Thought lo5 = Thought170.getInstance(ab4, fb0, fb1, lb1);

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 596.3870513042897;
        boolean lb2 = true;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + ld1;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(lb2, lb3, fb0, fb1);
}
        lb0 = !lb2;
    Output.points[1][4] -= fd1;
    Output.points[1][5] += ld1;
    fd0 = fd1 + ld1;
    Thought lo4 = Thought367.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb0);
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, lb3, fb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
        fd0 = fd1 - fd0;
    boolean lb0 = false;
    Output.points[1][6] += fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    Thought lo3 = Thought261.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(lb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought320.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld5 = 475.78330287354146;

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
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought384.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[1][7] += fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought76.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    Output.points[1][8] += fd1;
    fb1 = !lb2;
    fb0 = fb1 || lb2;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    Thought lo3 = Thought183.getInstance(fo0, fo1, fo0, fo1);

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
